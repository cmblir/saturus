package com.saturus.saturus.repository;

import com.saturus.saturus.domain.Member;
import org.junit.jupiter.api.Test;
import jakarta.persistence.EntityManager;


import static org.junit.jupiter.api.Assertions.*;

class JpaMemberRepositoryTest {
    private final EntityManager em;

    JpaMemberRepositoryTest(EntityManager em) {
        this.em = em;
    }

    @Test
    void save() {
        Member member = new Member();
        em.persist(member);
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void findByNumber() {
    }

    @Test
    void findAll() {
    }
}