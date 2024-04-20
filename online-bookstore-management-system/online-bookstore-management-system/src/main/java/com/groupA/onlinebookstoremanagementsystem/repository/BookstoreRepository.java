package com.groupA.onlinebookstoremanagementsystem.repository;

import com.groupA.onlinebookstoremanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookstoreRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);
}
