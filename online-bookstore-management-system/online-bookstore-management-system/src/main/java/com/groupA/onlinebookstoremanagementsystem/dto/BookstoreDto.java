package com.groupA.onlinebookstoremanagementsystem.dto;

import com.groupA.onlinebookstoremanagementsystem.entity.Genre;
import lombok.Getter;

public class BookstoreDto {
    private Long id;
    @Getter
    private String title;
    private String author;
    private Genre genre;
    private int price;

    public BookstoreDto(Long id, String title, String author, Genre genre, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}
