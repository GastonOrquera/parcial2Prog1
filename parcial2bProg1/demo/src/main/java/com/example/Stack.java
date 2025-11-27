package com.example;

// Stack.java
public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Pila vacía");
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Pila vacía");
        return top.data;
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }
}