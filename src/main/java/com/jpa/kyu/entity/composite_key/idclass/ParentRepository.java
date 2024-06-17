package com.jpa.kyu.entity.composite_key.idclass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, ParentId> {
}
