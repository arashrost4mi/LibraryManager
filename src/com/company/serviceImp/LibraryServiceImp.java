package com.company.serviceImp;

import com.company.domain.Book;
import com.company.domain.Client;
import com.company.domain.Library;
import com.company.service.LibraryService;

import java.util.List;

public class LibraryServiceImp implements LibraryService {

    Library library;
    @Override
    public void create(String name) {
        Library library = new Library(1, name);
    }

    @Override
    public void update(String name) {
        library.setName(name);
    }

    @Override
    public void showLibrary() {

        System.out.println( library.getName() );
        System.out.println("Books: ");
        for (int i = 0; i < library.getBooks().size(); i++) {
            Book book = library.getBooks().get(i);
            System.out.println(i + 1 + ". " + book.getName() + " / ID: " + book.getId());
            System.out.println("Writer: " + book.getWriter());

            if (book.isBorrowed()){

                for (int j = 0; j < getClientList().size(); j++) {

                    if (book.getClientId() == getClientList().get(j).getId()){

                        System.out.println("Client's name: " + getClientList().get(j).getName()+ " / ID: " + book.getClientId());
                        System.out.println("Not available!");

                    }
                }

            } else {

                System.out.println("Available!");

            }
        }
    }

    @Override
    public List<Book> getBookList() {
        return library.getBooks();
    }

    @Override
    public List<Client> getClientList() {
        return library.getClients();
    }

    @Override
    public void addBook(Book book) {
        library.getBooks().add(book);
    }

    @Override
    public void removeBook(Book book) {
        library.getBooks().remove(book);
    }

    @Override
    public void addClient(Client client) {
        library.getClients().add(client);
    }

    @Override
    public void removeClient(Client client) {
        library.getClients().remove(client);
    }
}
