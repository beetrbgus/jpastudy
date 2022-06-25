package com.jpa.kyu.service;

import com.jpa.kyu.dto.JoinMemberDto;
import com.jpa.kyu.dto.MemberDto;
import com.jpa.kyu.entity.Member;
import com.jpa.kyu.mapper.MemberEntityMapper;
import com.jpa.kyu.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository;
    private EntityManagerFactory factory;

    private MemberEntityMapper memberEntityMapper;
    @Override
    public JoinMemberDto saveMember(JoinMemberDto joinMemberDto) {
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Member member1 = memberEntityMapper.joinMemberDtoToEntity(joinMemberDto);
        Member member2 = memberEntityMapper.joinMemberDtoToEntity(joinMemberDto);

        manager.persist(member1);
        manager.persist(member2);

        transaction.commit();
        return null;
    }

    @Override
    public MemberDto findMemberById(Long id) {
        EntityManager manager = factory.createEntityManager();

        Member findMember1 = manager.find(Member.class,id);
        Member findMember2 = manager.find(Member.class,id);

        System.out.println(findMember1 == findMember2);


        return memberEntityMapper.EntityToMemberDto(findMember1);
    }

    @Override
    public MemberDto updateMemberById(Long id) {
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Member findMember1 = manager.find(Member.class,id);

        findMember1.setName("고길동");

        transaction.commit();
        return memberEntityMapper.EntityToMemberDto(findMember1);
    }
}
