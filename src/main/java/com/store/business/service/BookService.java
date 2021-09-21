package com.store.business.service;

import com.store.business.exception.BookException;
import com.store.business.mapper.BookMapper;
import com.store.business.repository.BookRepository;
import com.store.data.payload.BookPayload;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

  private final BookRepository repository;
  private final BookMapper mapper;

  public BookPayload getBook(Long id) {
    return repository.findById(id).map(mapper::bookToPayload).orElseThrow(BookException::new);
  }

  public List<BookPayload> getBooks() {
    return repository.findAll().stream().map(mapper::bookToPayload).collect(Collectors.toList());
  }

  public BookPayload createBook(BookPayload payload) {
    return Optional.of(repository.save(mapper.payloadToBook(payload)))
        .map(mapper::bookToPayload)
        .orElseThrow(BookException::new);
  }

  public BookPayload updateBook(BookPayload payload) {
    return Optional.of(repository.save(mapper.payloadToBook(payload)))
        .map(mapper::bookToPayload)
        .orElseThrow(BookException::new);
  }

  public void deleteBook(Long id) {
    repository.deleteById(id);
  }
}
