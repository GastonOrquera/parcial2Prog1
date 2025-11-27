package com.example;

// Library.java
public class Library {
    private String name;
    private LinkedList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new LinkedList<>();
    }

    public void addBook(Book book) { books.add(book); }
    public void removeBook(Book book) { books.remove(book); }

    public Book findBookByIsbn(String isbn) {
        Node<Book> current = books.getHead();
        while (current != null) {
            if (current.data.getIsbn().equalsIgnoreCase(isbn)) return current.data;
            current = current.next;
        }
        return null;
    }

    public LinkedList<Book> findBooksByAuthor(String author) {
        LinkedList<Book> result = new LinkedList<>();
        Node<Book> current = books.getHead();
        while (current != null) {
            if (current.data.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(current.data);
            }
            current = current.next;
        }
        return result;
    }

    public void getStatistics() {
        int total = 0, disponibles = 0, prestados = 0;
        Node<Book> current = books.getHead();
        while (current != null) {
            total++;
            if (current.data.isAvailable()) disponibles++;
            else prestados++;
            current = current.next;
        }
        System.out.println("📊 Biblioteca: " + name);
        System.out.println("Total: " + total + " | Disponibles: " + disponibles + " | Prestados: " + prestados);
    }
}