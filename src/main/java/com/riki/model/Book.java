package com.riki;

public class Book {
    String code;
    String title;
    String author;
    boolean available;
    String loanedBy; // new field

    Book(String code, String title, String author, boolean available, String loanedBy) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.available = available;
        this.loanedBy = loanedBy;
    }
}
