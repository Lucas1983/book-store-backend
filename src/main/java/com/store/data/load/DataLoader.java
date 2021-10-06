package com.store.data.load;

import com.github.javafaker.Faker;
import com.store.business.repository.BookRepository;
import com.store.data.model.Book;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

  private final Faker faker = Faker.instance();
  private final BookRepository bookRepository;

  @Override
  public void run(ApplicationArguments args) {

    Stream.generate(
            () -> Book.builder().title(faker.book().title()).author(faker.book().author()).build())
        .limit(100)
        .forEach(bookRepository::save);
  }
}
