package com.jpa.kyu.repository;

import com.jpa.kyu.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
