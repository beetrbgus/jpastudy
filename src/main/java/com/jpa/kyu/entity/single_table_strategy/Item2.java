package com.jpa.kyu.entity.single_table_strategy;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "item2")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE") // 엔터티를 저장할 떄 구분 컬럼에 입력할 값 지정
public abstract class Item2 {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;
    private String name;
    private int price;

    protected Item2() {

    }

    public Item2(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
