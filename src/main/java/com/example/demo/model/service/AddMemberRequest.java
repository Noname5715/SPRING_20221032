package com.example.demo.model.service;

import com.example.demo.model.domain.Member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*; // 어노테이션 자동 생성

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data
public class AddMemberRequest {
    @NotBlank // 공백 불가
    @Pattern(regexp = "^[a-zA-Z가-힣]+$") // 특수문자 불가
    private String name;

    @NotBlank // 공백 불가
    @Email // 이메일 검증
    private String email;

    @NotBlank // 공백 불가
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$") // 대소문자 포함 및, 8글자 이상
    private String password;

    @NotBlank // 공백 불가
    @Pattern(regexp = "^(1[9]|[2-8][0-9]|90)$") // 19 ~ 90
    private String age;

    private String mobile;
    private String address;

    public Member toEntity() { // Member 생성자를 통해 객체 생성
        return Member.builder()
                .name(name)
                .email(email)
                .password(password)
                .age(age)
                .mobile(mobile)
                .address(address)
                .build();
    }
}
