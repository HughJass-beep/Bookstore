package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Client {
    private String name;
    private List<Book> boughtBooks;
    private List<Book> wishList;

    public Client(String name, List<Book> boughtBooks, List<Book> wishList){
        this.name = name;
        this.boughtBooks = boughtBooks;
        this.wishList = wishList;
    }
    public Client(){
        name="Unknown client";
        boughtBooks = new ArrayList<>();
    }
    public Client(String name) {
        this.name = name;
        boughtBooks = new ArrayList<>();
    }

    public String getName() {
    }

    public Calendar getBoughtBooks() {
    }
}