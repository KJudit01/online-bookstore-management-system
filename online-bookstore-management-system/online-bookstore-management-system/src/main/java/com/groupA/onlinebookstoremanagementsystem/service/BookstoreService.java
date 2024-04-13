package com.groupA.onlinebookstoremanagementsystem.service;

import com.groupA.onlinebookstoremanagementsystem.dto.BookstoreDto;

import java.util.List;

public interface BookstoreService {
    BookstoreDto createBookstore(BookstoreDto bookstoreDto);

    List<BookstoreDto> getAllBookstore();
}
