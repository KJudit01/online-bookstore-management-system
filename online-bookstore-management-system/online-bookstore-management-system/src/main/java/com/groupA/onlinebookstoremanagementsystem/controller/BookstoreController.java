package com.groupA.onlinebookstoremanagementsystem.controller;

import com.groupA.onlinebookstoremanagementsystem.dto.BookstoreDto;
import com.groupA.onlinebookstoremanagementsystem.entity.Bookstore;
import com.groupA.onlinebookstoremanagementsystem.service.BookstoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BookstoreController {
    private final BookstoreService bookstoreService;


    @GetMapping("/test")
    List<BookstoreDto> getBooks(){
        return bookstoreService.getAllBookstore();
    }
}
