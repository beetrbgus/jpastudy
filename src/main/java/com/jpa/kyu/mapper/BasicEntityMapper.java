package com.jpa.kyu.mapper;


import org.mapstruct.*;

public interface BasicEntityMapper<E,D> {
    D toDto(E entity);
    E toEntity(D dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromDto(D dto, @MappingTarget E entity);
}
