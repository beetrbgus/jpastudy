package com.jpa.kyu;

import com.jpa.kyu.entity.join_strategy.Album;
import com.jpa.kyu.entity.join_strategy.Item;
import com.jpa.kyu.entity.single_table_strategy.Album2;
import com.jpa.kyu.repository.Item2Repository;
import com.jpa.kyu.repository.ItemRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemTest {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    Item2Repository item2Repository;

    @DisplayName(value = "조인 전략 생성 테스트")
    @Test
    void createJoinStrategyItem() {
        Album album = Album.builder()
            .title("테스트 앨범제목")
            .artistName("에메랄드")
            .name("아마 퇴근시간이 얼마 안남았을거야.")
            .price(5000)
            .build();
        itemRepository.save(album);
        Item item = itemRepository.findById(album.getId())
            .orElse(null);
        Assertions.assertEquals(item.getId(), album.getId());
    }

    @DisplayName(value = "단일 테이블 전략 생성 테스트")
    @Test
    void createSingleTableStrategyItem() {
        Album2 album = Album2.builder()
                        .title("테스트 앨범제목")
                        .artistName("에메랄드")
                        .name("아마 퇴근시간이 얼마 안남았을거야.")
                        .price(5000)
                        .build();
        item2Repository.save(album);

        Item item = itemRepository.findById(album.getId())
            .orElse(null);
        Assertions.assertEquals(item.getId(), album.getId());
    }
}
