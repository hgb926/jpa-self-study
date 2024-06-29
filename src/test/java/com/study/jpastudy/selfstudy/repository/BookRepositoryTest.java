package com.study.jpastudy.selfstudy.repository;

import com.study.jpastudy.selfstudy.entity.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;


    @Test
    @DisplayName("새로운 책을 db에 저장.")
    void saveTest() {
        //given
        Book book = Book.builder()
                .bookId(1L)
                .author("한기범")
                .title("세상 사는 법")
                .build();
        //when
        bookRepository.save(book);

        //then
        assertTrue(1 == bookRepository.count());
    }


}