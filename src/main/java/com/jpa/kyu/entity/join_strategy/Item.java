package com.jpa.kyu.entity.join_strategy;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 상속 매핑 사용시 부모 클래스에 사용해야 함.
@DiscriminatorColumn(name = "DTYPE") // 엔터티를 저장할 떄 구분 컬럼에 입력할 값 지정
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;
    private String name;
    private int price;

    protected Item() {

    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
