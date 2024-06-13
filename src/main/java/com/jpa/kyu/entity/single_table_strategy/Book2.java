package com.jpa.kyu.entity.single_table_strategy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("BOOK")
@PrimaryKeyJoinColumn(name = "BOOK_ID")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book2 extends Item2 {
    private String author;
    private String isbn;
    @Builder
    public Book2(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
}
