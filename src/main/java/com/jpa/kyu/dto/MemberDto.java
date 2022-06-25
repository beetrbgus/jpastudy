package com.jpa.kyu.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberDto {
    private Long id;
    private String name;
    private String gender;
}
