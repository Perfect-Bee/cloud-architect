package com.example.cloudarchitect.member.service;

import com.example.cloudarchitect.common.exception.MemberNotFoundException;
import com.example.cloudarchitect.member.dto.MemberCreateRequest;
import com.example.cloudarchitect.member.dto.MemberGetResponse;
import com.example.cloudarchitect.member.entity.Member;
import com.example.cloudarchitect.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    // 팀원 이름, 나이, MBTI 작성
    @Transactional
    public void createMember(MemberCreateRequest request) {
        Member member = new Member(
                request.getName(),
                request.getAge(),
                request.getMbti()
        );

        memberRepository.save(member);
    }

    // 팀원 이름, 나이, MBTI 조회
    @Transactional(readOnly = true)
    public MemberGetResponse getMember(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new MemberNotFoundException("해당 인원은 존재하지 않습니다.")
        );

        return new MemberGetResponse(
                member.getId(),
                member.getName(),
                member.getAge(),
                member.getMbti()
        );
    }

}
