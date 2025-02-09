package com.mycompany.micronautjpamysql.mapper;

import com.mycompany.micronautjpamysql.model.Book;
import com.mycompany.micronautjpamysql.rest.dto.CreateBookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import jakarta.inject.Singleton;

@Singleton
@Mapper(componentModel = "jsr330")
public interface BookMapper {

    @Mapping(target = "id", ignore = true)
    Book toBook(CreateBookRequest createBookRequest);
}
