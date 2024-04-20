package com.groupA.onlinebookstoremanagementsystem.controller;

import com.groupA.onlinebookstoremanagementsystem.entity.Book;
import com.groupA.onlinebookstoremanagementsystem.service.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BookstoreController {

    private final Service service;

    @GetMapping("/book")
    List<Book> getBook(@RequestParam String title) {
        return service.findByTitle(title);
    }

    @GetMapping("/book2/{title}")
    ResponseEntity<List<Book>> getBook2(@PathVariable String title) {
        log.info("Findig book by title", title);
        final var book = service.findByTitle(title);
        if (book.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(book);
        }
    }

    @PostMapping("/addbook")
    Book addBook(@RequestBody Book book) {
        log.info("Adding a book{}", book);
        return service.addBook(book);
    }
}
