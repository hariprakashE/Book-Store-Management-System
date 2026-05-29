package com.bookStore.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.bookStore.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
