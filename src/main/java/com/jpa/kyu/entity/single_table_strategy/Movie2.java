package com.jpa.kyu.entity.single_table_strategy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MOVIE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Movie2 extends Item2 {
    private String actorName;
    private String title;

    @Builder
    public Movie2(String name, int price, String actorName, String title) {
        super(name, price);
        this.actorName = actorName;
        this.title = title;
    }
}
