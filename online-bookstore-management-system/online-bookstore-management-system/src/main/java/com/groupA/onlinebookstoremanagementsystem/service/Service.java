package com.groupA.onlinebookstoremanagementsystem.service;

import com.groupA.onlinebookstoremanagementsystem.entity.Book;
import com.groupA.onlinebookstoremanagementsystem.repository.BookstoreRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@org.springframework.stereotype.Service
@Slf4j
@RequiredArgsConstructor
public class Service {
    private final BookstoreRepository bookstoreRepository;

    public List<Book> findByTitle(String title) {
        final var book = bookstoreRepository.findByTitle(title);
        return book;
    }

    public Book addBook(Book book) {
        return bookstoreRepository.save(book);
    }
    public void deleteBook(Long id){
        bookstoreRepository.deleteById(id);
    }
}
