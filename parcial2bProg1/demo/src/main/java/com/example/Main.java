package com.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        Library biblioteca = new Library("Biblioteca Central");

        Book libro1 = new Book("Rayuela", "111", "Julio Cortázar", 1963);
        Book libro2 = new Book("Pedro Páramo", "222", "Juan Rulfo", 1955);

        // Cola de adquisiciones
        Queue<Book> adquisiciones = new Queue<>();
        adquisiciones.enqueue(libro1);
        adquisiciones.enqueue(libro2);

        biblioteca.addBook(adquisiciones.dequeue());
        biblioteca.addBook(adquisiciones.dequeue());

        // Pila de préstamos
        Stack<Book> prestamos = new Stack<>();
        prestamos.push(libro1);
        prestamos.push(libro2);

        System.out.println("Préstamo actual: " + prestamos.peek());

        biblioteca.getStatistics();
        biblioteca.findBooksByAuthor("Cortázar").printList();
    }
}