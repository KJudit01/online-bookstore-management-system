package com.groupA.onlinebookstoremanagementsystem.service;

import com.groupA.onlinebookstoremanagementsystem.dto.BookstoreDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookstoreService {
    BookstoreDto createBookstore(BookstoreDto bookstoreDto);

    List<BookstoreDto> getAllBookstore();
}
