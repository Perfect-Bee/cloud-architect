package com.example.cloudarchitect.member.repository;

import com.example.cloudarchitect.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
