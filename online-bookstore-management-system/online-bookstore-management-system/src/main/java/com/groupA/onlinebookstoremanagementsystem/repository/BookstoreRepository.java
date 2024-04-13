package com.groupA.onlinebookstoremanagementsystem.repository;

import com.groupA.onlinebookstoremanagementsystem.entity.Bookstore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookstoreRepository extends JpaRepository<Bookstore,Long> {

}
