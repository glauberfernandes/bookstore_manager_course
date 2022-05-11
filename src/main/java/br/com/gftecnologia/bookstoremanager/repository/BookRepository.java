package br.com.gftecnologia.bookstoremanager.repository;

import br.com.gftecnologia.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

public interface BookRepository extends JpaRepository<Book, Long> {
}
