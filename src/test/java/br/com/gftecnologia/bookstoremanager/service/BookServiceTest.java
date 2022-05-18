package br.com.gftecnologia.bookstoremanager.service;

import br.com.gftecnologia.bookstoremanager.dto.BookDTO;
import br.com.gftecnologia.bookstoremanager.entity.Book;
import br.com.gftecnologia.bookstoremanager.repository.BookRepository;
import br.com.gftecnologia.bookstoremanager.utils.BookUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static br.com.gftecnologia.bookstoremanager.utils.BookUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class})
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void whenGivenExistingIdThenReturnThisBook() {
        Book expectedFoundBook = createFakeBook();

        when(bookRepository.findById(expectedFoundBook.getId())).thenReturn(Optional.of(expectedFoundBook));

        BookDTO bookDTO = bookService.findById(expectedFoundBook.getId());

        assertEquals(expectedFoundBook.getName(), bookDTO.getName());
        assertEquals(expectedFoundBook.getIsbn(), bookDTO.getIsbn());
        assertEquals(expectedFoundBook.getPublisherName(), bookDTO.getPublisherName());
    }
}
