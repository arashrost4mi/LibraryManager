package com.company.service;

import com.company.domain.Book;
import com.company.domain.Client;
import com.company.domain.Library;

import java.util.List;

public interface LibraryService {

    void create(String name);

    void update(int id, String name);

    void delete(int id, Library library);

    void showLibrary();

    List<Book> getBookList();

    List<Client> getClientList();

    void addBook(Book book);

    void removeBook(Book book);

    void addClient(Client client);

    void removeClient(Client client);
}
