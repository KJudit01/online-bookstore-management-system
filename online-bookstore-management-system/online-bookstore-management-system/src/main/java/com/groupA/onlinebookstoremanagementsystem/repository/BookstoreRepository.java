package com.groupA.onlinebookstoremanagementsystem.repository;

import com.groupA.onlinebookstoremanagementsystem.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookstoreRepository extends JpaRepository<Bookstore,Long> {

    List<Bookstore> getByTitle(String title);


}
