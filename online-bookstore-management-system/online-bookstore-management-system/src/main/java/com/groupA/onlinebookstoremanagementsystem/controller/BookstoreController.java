package com.groupA.onlinebookstoremanagementsystem.controller;

import com.groupA.onlinebookstoremanagementsystem.service.BookstoreService;
import org.springframework.http.ResponseEntity;

public class BookstoreController {
    public BookstoreService bookstoreService;

    public BookstoreController(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

   
}
