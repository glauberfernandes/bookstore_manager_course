package br.com.gftecnologia.bookstoremanager.mapper;

import br.com.gftecnologia.bookstoremanager.dto.BookDTO;
import br.com.gftecnologia.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
