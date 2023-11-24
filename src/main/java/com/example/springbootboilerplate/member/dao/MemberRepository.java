package com.example.springbootboilerplate.member.dao;

import com.example.springbootboilerplate.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Boolean existsByUserId(String userId);

}
