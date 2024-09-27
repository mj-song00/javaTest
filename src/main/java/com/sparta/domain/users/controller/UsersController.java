package com.sparta.domain.users.controller;

import com.sparta.domain.users.dto.request.SignupRequest;
import com.sparta.domain.users.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    /**
     * 회원가입
     * RequsetBody: email, nickname, password
     */
    @PostMapping("/sign-up")
    public ResponseEntity<String>signup (@RequestBody SignupRequest request){
        try {
            usersService.signup(request);
            return new ResponseEntity<>("화원가입 완료", HttpStatus.OK);
        }catch(RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

//    @PostMapping("/sign-in")
//    public  ResponseEntity

}
