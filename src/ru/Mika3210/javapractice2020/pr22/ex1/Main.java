package ru.Mika3210.javapractice2020.pr22.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и тип вывода даты:\n 1 - короткий\n 2 - средний \n 3 - полный");
        Student student = new Student(scanner.nextLine());
        System.out.println(student.toString(scanner.nextLine()));
    }
}
