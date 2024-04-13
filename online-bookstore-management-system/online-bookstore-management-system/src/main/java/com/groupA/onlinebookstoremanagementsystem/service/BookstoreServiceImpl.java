package com.groupA.onlinebookstoremanagementsystem.service;

import com.groupA.onlinebookstoremanagementsystem.dto.BookstoreDto;
import com.groupA.onlinebookstoremanagementsystem.entity.Bookstore;
import com.groupA.onlinebookstoremanagementsystem.mapper.BookstoreMapper;
import com.groupA.onlinebookstoremanagementsystem.repository.BookstoreRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BookstoreServiceImpl implements BookstoreService{
    private BookstoreRepository bookstoreRepository;

    public BookstoreServiceImpl(BookstoreRepository bookstoreRepository) {
        this.bookstoreRepository = bookstoreRepository;
    }

    public BookstoreDto createBookstore(BookstoreDto bookstoreDto){
        Bookstore bookstore = BookstoreMapper.mapToBookstore(bookstoreDto);
        Bookstore savedBookstore = bookstoreRepository.save(bookstore);
        return BookstoreMapper.mapToBookstoreDto(savedBookstore);
    }

    @Override
    public List<BookstoreDto> getAllBookstore(){
        List<Bookstore> books = bookstoreRepository.findAll();
        return books.stream().map((book) -> BookstoreMapper.mapToBookstoreDto(book)).collect(Collectors.toList());
    }

}
