package com.groupA.onlinebookstoremanagementsystem.mapper;

import com.groupA.onlinebookstoremanagementsystem.dto.BookstoreDto;
import com.groupA.onlinebookstoremanagementsystem.entity.Bookstore;

public class BookstoreMapper {
    public static Bookstore mapToBookstore(BookstoreDto bookstoreDto){
    Bookstore bookstore = new Bookstore(
            bookstoreDto.getId(),
            bookstoreDto.getTitle(),
            bookstoreDto.getAuthor(),
            bookstoreDto.getGenre(),
            bookstoreDto.getPrice()
    );
    return bookstore;
    }

    public static BookstoreDto mapToBookstoreDto(Bookstore bookstore){
        BookstoreDto bookstoreDto = new BookstoreDto(
                bookstore.getId(),
                bookstore.getTitle(),
                bookstore.getAuthor(),
                bookstore.getGenre(),
                bookstore.getPrice()
        );
        return bookstoreDto;
    }
}
