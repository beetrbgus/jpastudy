package com.jpa.kyu.entity.composite_key.idclass;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Entity
@IdClass(ParentId.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Parent {
    @Id
    @Column(name = "parent_id1")
    private String id1;
    @Id
    @Column(name = "parent_id2")
    private String id2;
    private String name;
}
