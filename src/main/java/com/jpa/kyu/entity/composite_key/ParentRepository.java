package com.jpa.kyu.entity.composite_key;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, ParentId> {
}
