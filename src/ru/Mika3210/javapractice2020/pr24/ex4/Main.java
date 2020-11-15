package ru.Mika3210.javapractice2020.pr24.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите так: +<Код страны><Номер 10 цифр>, например “+79175655655” или\n" +
                "8<Номер 10 цифр> для России, например “89175655655");
        Scanner scanner = new Scanner(System.in);
        PhoneNumber phoneNumber = new PhoneNumber(scanner.nextLine());
        phoneNumber.Return();
        System.out.println(phoneNumber.toString());
//        String str = scanner.nextLine();
//        phoneNumber.convert(str);
    }
}
