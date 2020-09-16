package com.company.service;

import com.company.domain.Client;

public interface ClientService {

    void create(String name);

    void update(int id, String name);

    void delete(int id, Client client);

    Client findClient(int id);

    void borrow(int bookId, int clientId);

    void giveBack(int bookId);

    void showBorrowedBooks(int clientId);
}
