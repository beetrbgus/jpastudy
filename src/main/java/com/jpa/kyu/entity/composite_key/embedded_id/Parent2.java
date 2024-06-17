package com.jpa.kyu.entity.composite_key.embedded_id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "parent_2")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Parent2 {
    @EmbeddedId
    private ParentId id;
    private String name;
}