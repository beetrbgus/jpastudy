package com.jpa.kyu.service;

import com.jpa.kyu.dto.JoinMemberDto;

public interface MemberService {
    JoinMemberDto saveMember(JoinMemberDto joinMemberDto);
}
