package com.jpa.kyu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class JoinMemberDto {

    private Long id;
    private String name;
    private String gender;
}
