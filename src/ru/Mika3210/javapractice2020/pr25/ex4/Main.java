package ru.Mika3210.javapractice2020.pr25.ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String abc = example;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matchers = pattern.matcher(example);
        do {
            example = matchers.replaceAll("");
            matchers = pattern.matcher(example);
        }
        while (matchers.find());
        if (example.matches("[\\d+/*-]*"))
            System.out.println(abc);
    }
}