package com.study.jpastudy.selfstudy.repository;

import com.study.jpastudy.selfstudy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
