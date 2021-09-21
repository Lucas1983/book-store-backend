package com.store.business.mapper;

import com.store.data.model.Book;
import com.store.data.payload.BookPayload;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

  @Mappings({
    @Mapping(source = "id", target = "id"),
    @Mapping(source = "title", target = "title"),
    @Mapping(source = "author", target = "author")
  })
  BookPayload bookToPayload(Book book);

  @Mappings({
    @Mapping(source = "id", target = "id"),
    @Mapping(source = "title", target = "title"),
    @Mapping(source = "author", target = "author")
  })
  Book payloadToBook(BookPayload payload);
}
