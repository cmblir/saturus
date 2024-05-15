package com.saturus.saturus.repository;

import com.saturus.saturus.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);
    // Optional은 NullPointException을 막기 위해 만들어진 함수
    Optional<Member> findByName(String name);

    Optional<Member> findByNumber(String num);
    List<Member> findAll();
}
