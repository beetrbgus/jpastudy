package com.jpa.kyu.controller;

import com.jpa.kyu.dto.JoinMemberDto;
import com.jpa.kyu.dto.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @PostMapping
    public ResponseEntity<JoinMemberDto> saveMember(@RequestBody JoinMemberDto joinMemberDto){

        return null;
    }
    @GetMapping
    public ResponseEntity<List<MemberDto>> getMemberList(){

        return null;
    }
}
