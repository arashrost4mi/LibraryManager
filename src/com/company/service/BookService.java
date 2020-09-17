package com.company.service;

import com.company.domain.Book;
import com.company.domain.Client;

import java.util.List;

public interface BookService {

    void create(String name, String writer);

    void update(int id, String name, String writer, boolean borrowed, int clientId);

    void delete(int id);

    Book findBook(int id);

    Client showClient(int bookId);

    List<Book> showBorrowedBooks();
}
