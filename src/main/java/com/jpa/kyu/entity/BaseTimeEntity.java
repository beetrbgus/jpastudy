package com.jpa.kyu.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.ZonedDateTime;

@MappedSuperclass
public abstract class BaseTimeEntity {

    @CreatedDate
    @Column(name = "create_dt")
    private ZonedDateTime createDt;

    @LastModifiedDate
    @Column(name = "update_dt")
    private ZonedDateTime updateDt;

    @PrePersist
    protected void prePersist(){
        this.createDt = ZonedDateTime.now();
        this.updateDt = ZonedDateTime.now();
    }
    @PreUpdate
    protected  void preUpdate(){
        this.updateDt = ZonedDateTime.now();
    }
}
