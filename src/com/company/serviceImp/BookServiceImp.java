package com.company.serviceImp;

import com.company.domain.Book;
import com.company.service.BookService;

public class BookServiceImp implements BookService {
    @Override
    public void create(String name, String writer, boolean borrowed, int clientId) {

    }

    @Override
    public void update(int id, String name, String writer, boolean borrowed, int clientId) {

    }

    @Override
    public void delete(int id, Book book) {

    }

    @Override
    public Book findBook(int id) {
        return null;
    }

    @Override
    public void showClient(int bookId) {

    }

    @Override
    public void showBorrowedBooks() {

    }
}
