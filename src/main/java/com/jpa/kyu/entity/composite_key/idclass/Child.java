package com.jpa.kyu.entity.composite_key.idclass;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Getter
@Entity
public class Child {
    @Id
    @Column(name = "parent_id")
    private String id1;
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "p_id1",
        referencedColumnName = "parent_id1"),
        @JoinColumn(name = "p_id2",
            referencedColumnName = "parent_id2")
    })
    private Parent parent;
}
