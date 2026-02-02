package com.example.cloudarchitect.member.controller;

import com.example.cloudarchitect.member.dto.MemberCreateRequest;
import com.example.cloudarchitect.member.dto.MemberGetResponse;
import com.example.cloudarchitect.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members") // 중복 정리
public class MemberController {
    private final MemberService memberService;

    // 팀원 이름, 나이, MBTI 작성
    @PostMapping
    public ResponseEntity<Void> createMember(
            @RequestBody MemberCreateRequest request
    ) {
        memberService.createMember(request);
        return ResponseEntity.ok().build();
    }

    // 팀원 이름, 나이, MBTI 조회
    @GetMapping("/{memberId}")
    public ResponseEntity<MemberGetResponse> getMember(
            @PathVariable Long memberId
    ) {
        MemberGetResponse response = memberService.getMember(memberId);
        return ResponseEntity.ok(response);
    }
}
