package com.example.springbootboilerplate.auth.application;

import com.example.springbootboilerplate.auth.dto.MemberRequestDto;
import com.example.springbootboilerplate.global.exception.badrequest.duplicated.DuplicatedUserIdException;
import com.example.springbootboilerplate.member.dao.MemberRepository;
import com.example.springbootboilerplate.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {

    private final MemberRepository memberRepository;

    public String signUp(MemberRequestDto memberRequestDto) {
        if (Boolean.TRUE.equals(memberRepository.existsByUserId(memberRequestDto.userId()))) {
            throw new DuplicatedUserIdException();
        }

        Member member = memberRequestDto.toMember(memberRequestDto.userId(), memberRequestDto.password());
        memberRepository.save(member);

        return "회원가입이 완료되었습니다.";
    }
}
