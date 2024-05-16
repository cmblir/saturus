package com.saturus.saturus.service;

import com.saturus.saturus.domain.Member;
import com.saturus.saturus.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        // MemberService에 MemberRepository 의존성을 주입
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
        validateDuplicateMember(member); // Id로 존재하는 지 확인
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findById(member.getId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    private void validateDuplicatePhoneNumber(Member member) {
        memberRepository.findByNumber(member.getPhoneNumber())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 전화번호입니다.");
                });
    }

    public List<Member> findMember() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

    public Optional<Member> findNumber(String memberNum) {
        return memberRepository.findByNumber(memberNum);
    }

}
