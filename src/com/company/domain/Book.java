package com.company.domain;

public class Book {

    int id;

    String name;

    String writer;

    boolean borrowed;

    int clientId;

    public Book(int id, String name, String writer, boolean borrowed, int clientId) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.borrowed = borrowed;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
