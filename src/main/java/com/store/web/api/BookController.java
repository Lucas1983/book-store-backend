package com.store.web.api;

import com.store.business.service.BookService;
import com.store.data.payload.BookPayload;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

  private final BookService service;

  @GetMapping("/{id}")
  public BookPayload getBook(@PathVariable Long id) {
    return service.getBook(id);
  }

  @GetMapping
  public List<BookPayload> getBooks() {
    return service.getBooks();
  }

  @PostMapping
  public BookPayload createBook(@RequestBody BookPayload payload) {
    return service.createBook(payload);
  }

  @PutMapping
  public BookPayload updateBook(@RequestBody BookPayload payload) {
    return service.updateBook(payload);
  }

  @DeleteMapping("/{id}")
  public void deleteBook(@PathVariable Long id) {
    service.deleteBook(id);
  }
}
