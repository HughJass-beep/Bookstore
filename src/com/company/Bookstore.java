package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

    private List<Book> books;

    public Bookstore()
    {
        books= new ArrayList<>();
    }
    public Bookstore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void buyBooks(com.company.Client client, Book book) {
        System.out.println("Client" + client.getName() + " си купи " + book.getTitle());
        client.getBoughtBooks().add(book);
    }
}