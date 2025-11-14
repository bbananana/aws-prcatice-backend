package jpabook.jpashop1.service;

import jakarta.persistence.EntityManager;
import jpabook.jpashop1.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemUpdateTest {

    @Autowired
    EntityManager em;
    
    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        // TX
        book.setName("도시 JPA");

        // 변경감지 == dirty checking
        // TX COMMIT

    }

}