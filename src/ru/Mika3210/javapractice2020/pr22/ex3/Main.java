package ru.Mika3210.javapractice2020.pr22.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String secondName=scanner.nextLine();
        System.out.println("Ваша фамилия: " + secondName);
        task.getStart();
        task.getFinish();
    }
}
