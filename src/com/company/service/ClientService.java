package com.company.service;

import com.company.domain.Book;
import com.company.domain.Client;

import java.util.List;

public interface ClientService {

    void create(String name);

    void update(int id, String name);

    void delete(int id);

    Client findClient(int id);

    void borrow(int bookId, int clientId);

    void giveBack(int bookId);

    List<Book> showBorrowedBooks(int clientId);
}
