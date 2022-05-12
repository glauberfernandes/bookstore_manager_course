package br.com.gftecnologia.bookstoremanager.controller;

import br.com.gftecnologia.bookstoremanager.dto.MessageResponseDTO;
import br.com.gftecnologia.bookstoremanager.entity.Book;
import br.com.gftecnologia.bookstoremanager.repository.BookRepository;
import br.com.gftecnologia.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
       return bookService.create(book);
    }
}
