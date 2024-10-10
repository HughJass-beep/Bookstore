package com.company;

public class Book {
    private int pagesCount;
    private String title;
    private String coverColor;
    private Author author;
    private String publisher;
    private double price;
    public Book() {
        pagesCount = 100;
        title = "tashak";
        coverColor = "chicken bake";
        publisher = "TheRizzler";
        price = 69;
    }
    //public Book(){
        //this.author= new author;
    //}
    public Book(int pagesCount, String title, String coverColor, Author author, String publisher, double price){
            this.pagesCount=pagesCount;
            this.title=title;
            this.coverColor=coverColor;
            this.author=author;
            this.publisher=publisher;
            this.price=price;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title){
            this.title=title;
        }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}