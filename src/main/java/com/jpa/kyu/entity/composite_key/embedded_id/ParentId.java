package com.jpa.kyu.entity.composite_key.embedded_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ParentId implements Serializable {
    @Column(name = "parent_id3")
    private String id3;
    @Column(name = "parent_id4")
    private String id4;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
