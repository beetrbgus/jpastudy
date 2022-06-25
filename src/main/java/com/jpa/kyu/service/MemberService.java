package com.jpa.kyu.service;

import com.jpa.kyu.dto.JoinMemberDto;
import com.jpa.kyu.dto.MemberDto;

public interface MemberService {
    JoinMemberDto saveMember(JoinMemberDto joinMemberDto);

    MemberDto findMemberById(Long id);

    MemberDto updateMemberById(Long id);
}
