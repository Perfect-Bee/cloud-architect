package com.example.cloudarchitect.member.dto;

import lombok.Getter;

@Getter
public class MemberGetResponse {
    private final Long id;
    private final String name;
    private final Long age;
    private final String mbti;

    public MemberGetResponse(Long id, String name, Long age, String mbti) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }
}
