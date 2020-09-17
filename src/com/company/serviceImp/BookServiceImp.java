package com.company.serviceImp;

import com.company.domain.Book;
import com.company.domain.Client;
import com.company.service.BookService;
import com.company.service.ClientService;
import com.company.service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImp implements BookService  {
    LibraryService libraryService;
    ClientService clientService;
    @Override
    public void create(String name, String writer) {
        Book book = new Book(IDGen.generate(), name, writer);
    }

    @Override
    public void update(int id, String name, String writer, boolean borrowed, int clientId) {
        Book book = findBook(id);
        book.setName(name);
        book.setWriter(writer);
        book.setBorrowed(borrowed);
        book.setClientId(clientId);
    }

    @Override
    public void delete(int id) {
        Book book = findBook(id);
        libraryService.removeBook(book);
    }

    @Override
    public Book findBook(int id) {
        List<Book> bookList = libraryService.getBookList();
        for (int i=0; i< bookList.size() ; i++){
            if (bookList.get(i).getId() == id)
                return bookList.get(i);
        }
        return null;
    }

    @Override
    public Client showClient(int bookId) {
        List<Book> bookList = libraryService.getBookList();
        for (int i=0; i< bookList.size() ; i++){
            if (bookList.get(i).getId() == bookId)
                return clientService.findClient(bookList.get(i).getClientId());
        }
        return null;
    }

    @Override
    public List<Book> showBorrowedBooks() {
        List<Book> bookList = libraryService.getBookList();
        List<Book> borrowedBookList = new ArrayList<Book>();
        for (int i=0; i< bookList.size() ; i++){
            if (bookList.get(i).isBorrowed())
                borrowedBookList.add(bookList.get(i));
        }
        return borrowedBookList;
    }
}
