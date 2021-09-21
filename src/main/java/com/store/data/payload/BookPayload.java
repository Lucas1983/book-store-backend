package com.store.data.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class BookPayload {

  long id;
  String title;
  String author;
}
