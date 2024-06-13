package com.jpa.kyu;

import com.jpa.kyu.entity.join_strategy.Album;
import com.jpa.kyu.repository.ItemRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemTest {
    @Autowired
    ItemRepository itemRepository;
    @Test
    void createItem() {
        Album album = Album.builder()
            .title("테스트 앨범제목")
            .artistName("에메랄드")
            .name("아마 퇴근시간이 얼마 안남았을거야.")
            .price(5000)
            .build();
        itemRepository.save(album);
    }
}
