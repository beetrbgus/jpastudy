package com.jpa.kyu;

import com.jpa.kyu.entity.composite_key.idclass.Parent;
import com.jpa.kyu.entity.composite_key.idclass.ParentId;
import com.jpa.kyu.entity.composite_key.idclass.ParentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompositeKeyTest {
    @Autowired
    ParentRepository parentRepository;

    @Test
    @DisplayName(value = "복합기 생성 테스트")
    public void insert() {
        String pk1 = "테스트 복합키4";
        String pk2 = "테스트 복합키4";
        Parent parent = new Parent(pk1, pk2, "테스트 이름2");
        parentRepository.save(parent);
        ParentId parentId = new ParentId(pk1, pk2);
        Parent findParent = parentRepository.findById(parentId).get();
        Assertions.assertEquals(parent.getId1(), findParent.getId1());
    }
}
