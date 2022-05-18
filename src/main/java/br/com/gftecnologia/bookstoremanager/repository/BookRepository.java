package br.com.gftecnologia.bookstoremanager.repository;

import br.com.gftecnologia.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
