package ru.Mika3210.javapractice2020.pr25.ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkExpression(scanner.nextLine()));
    }
    private static boolean checkExpression(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }
}
