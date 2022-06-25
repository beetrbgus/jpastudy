package com.jpa.kyu.mapper;

import com.jpa.kyu.dto.JoinMemberDto;
import com.jpa.kyu.dto.MemberDto;
import com.jpa.kyu.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MemberEntityMapper {
    MemberEntityMapper INSTANCE = Mappers.getMapper(MemberEntityMapper.class);

    Member joinMemberDtoToEntity(JoinMemberDto joinMemberDto);
    JoinMemberDto EntityToJoinMemberDto(Member member);

}
