package com.company.serviceImp;

import com.company.domain.Client;
import com.company.service.ClientService;

public class ClientServiceImp implements ClientService {
    @Override
    public void create(String name) {

    }

    @Override
    public void update(int id, String name) {

    }

    @Override
    public void delete(int id, Client client) {

    }

    @Override
    public Client findClient(int id) {
        return null;
    }

    @Override
    public void borrow(int bookId, int clientId) {

    }

    @Override
    public void giveBack(int bookId) {

    }

    @Override
    public void showBorrowedBooks(int clientId) {

    }
}
