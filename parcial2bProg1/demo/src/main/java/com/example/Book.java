package com.example;

// Book.java
public class Book {
    private String title;
    private String isbn;
    private String author;
    private int publicationYear;
    private boolean available;
    private int timesLoaned;

    public Book(String title, String isbn, String author, int publicationYear) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
        this.timesLoaned = 0;
    }

    public void lend() {
        if (available) {
            available = false;
            timesLoaned++;
            System.out.println("Prestado: " + title);
        } else {
            System.out.println("No disponible: " + title);
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Devuelto: " + title);
        }
    }

    // Getters
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return available; }
    public int getTimesLoaned() { return timesLoaned; }

    @Override
    public String toString() {
        return "[" + title + " | " + author + " | ISBN:" + isbn + "]";
    }
}