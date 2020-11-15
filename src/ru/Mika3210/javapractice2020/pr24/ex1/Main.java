package ru.Mika3210.javapractice2020.pr24.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine());
        System.out.println(person.Return());
    }
}
