package com.company.serviceImp;

import com.company.domain.Book;
import com.company.domain.Client;
import com.company.service.BookService;
import com.company.service.ClientService;
import com.company.service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceImp implements ClientService {
    LibraryService libraryService;
    BookService bookService;
    @Override
    public void create(String name) {
        Client client = new Client(IDGen.generate(), name);
    }

    @Override
    public void update(int id, String name) {
        Client client = findClient(id);
        client.setName(name);
    }

    @Override
    public void delete(int id) {
        Client client = findClient(id);
        libraryService.removeClient(client);
    }

    @Override
    public Client findClient(int id) {
        List<Client> clientList = libraryService.getClientList();
        for (int i=0; i< clientList.size() ; i++){
            if (clientList.get(i).getId() == id)
                return clientList.get(i);
        }
        return null;
    }

    @Override
    public void borrow(int bookId, int clientId) {
        Book book = bookService.findBook(bookId);
        book.setBorrowed(true);
        book.setClientId(clientId);
    }

    @Override
    public void giveBack(int bookId) {
        Book book = bookService.findBook(bookId);
        book.setBorrowed(false);
        book.setClientId(0);
    }

    @Override
    public List<Book> showBorrowedBooks(int clientId) {
        List<Book> bookList = libraryService.getBookList();
        List<Book> borrowedBookList = new ArrayList<Book>();
        for (int i=0; i< bookList.size() ; i++){
            if (bookList.get(i).getClientId()==clientId)
                borrowedBookList.add(bookList.get(i));
        }
        return borrowedBookList;
    }
}
