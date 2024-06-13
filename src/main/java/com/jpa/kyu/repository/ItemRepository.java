package com.jpa.kyu.repository;

import com.jpa.kyu.entity.join_strategy.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
