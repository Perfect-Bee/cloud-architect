package com.example.cloudarchitect.member.dto;

import lombok.Getter;

@Getter
public class MemberCreateRequest {
    private String name;
    private Long age;
    private String mbti;
}