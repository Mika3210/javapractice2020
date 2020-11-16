package ru.Mika3210.javapractice2020.pr26.ex2;

public interface Queue {
    void enqueue(Object element);
    Object  dequeue();
    Object[] toArray();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}
