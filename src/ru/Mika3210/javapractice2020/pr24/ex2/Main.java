package ru.Mika3210.javapractice2020.pr24.ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address address = new Address(scanner.nextLine());
        address.returnAddress();
        System.out.println(address.toString());
    }
}
