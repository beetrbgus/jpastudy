package com.jpa.kyu.entity.join_strategy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MOVIE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Movie extends Item {
    private String actorName;
    private String title;

    @Builder
    public Movie(String name, int price, String actorName, String title) {
        super(name, price);
        this.actorName = actorName;
        this.title = title;
    }
}
