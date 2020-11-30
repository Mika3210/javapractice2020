package ru.Mika3210.javapractice2020.pr29;

import java.util.HashMap;

interface Order {
    boolean addPosition(Item a);
    boolean addPosition(Item a, HashMap<String, Order> hashMap);
    boolean addPosition(HashMap<String, Order> hashMap);
    int delete(Item a);
    int delete(Item a, HashMap<String, Order> hashMap);
    int count();
    Item getCount(HashMap<String, Order> hashMap);
    Item arrayCount();
    Item arrayCountSorted();
    int cost();
    int totalOrders(String name);
    int total(Item a);
    Item arrayCountNames();
}
