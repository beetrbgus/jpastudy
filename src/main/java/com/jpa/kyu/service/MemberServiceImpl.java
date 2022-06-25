package com.jpa.kyu.service;

import com.jpa.kyu.dto.JoinMemberDto;
import com.jpa.kyu.entity.Member;
import com.jpa.kyu.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository;
    private EntityManagerFactory factory;

    @Override
    public JoinMemberDto saveMember(JoinMemberDto joinMemberDto) {
        EntityManager manager = factory.createEntityManager();

        Member member =
                Member.builder()
                        .name(joinMemberDto.getName())
                        .gender(joinMemberDto.getGender())
                        .build();

        manager.persist(member);

        return null;
    }
}
