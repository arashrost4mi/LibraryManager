package com.company.service;

import com.company.domain.Book;

public interface BookService {

    void create(String name, String writer, boolean borrowed, int clientId);

    void update(int id, String name, String writer, boolean borrowed, int clientId);

    void delete(int id, Book book);

    Book findBook(int id);

    void showClient(int bookId);

    void showBorrowedBooks();
}
