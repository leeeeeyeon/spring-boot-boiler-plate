package com.example.springbootboilerplate.auth.api;

import com.example.springbootboilerplate.auth.application.AuthService;
import com.example.springbootboilerplate.auth.dto.MemberRequestDto;
import com.example.springbootboilerplate.global.response.DataResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public DataResponseDto<String> signUp(@RequestBody MemberRequestDto memberRequestDto) {
        return DataResponseDto.from(authService.signUp(memberRequestDto));
    }
}
