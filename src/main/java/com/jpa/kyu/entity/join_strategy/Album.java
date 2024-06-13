package com.jpa.kyu.entity.join_strategy;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Entity
@DiscriminatorValue("ALBUM")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Album extends Item {
    private String artistName;
    private String title;

    @Builder
    public Album(String name, int price, String artistName, String title) {
        super(name, price);
        this.artistName = artistName;
        this.title = title;
    }
}
