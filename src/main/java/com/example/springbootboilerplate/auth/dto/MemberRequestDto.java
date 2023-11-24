package com.example.springbootboilerplate.auth.dto;

import com.example.springbootboilerplate.member.domain.Member;
import com.example.springbootboilerplate.member.domain.Role;
import lombok.Builder;

@Builder
public record MemberRequestDto (
    String userId,
    String password
) {
    public Member toMember(String userId, String password) {
        return Member.builder()
            .userId(userId)
            .password(password)
            .role(Role.USER)
            .build();
    }
}
