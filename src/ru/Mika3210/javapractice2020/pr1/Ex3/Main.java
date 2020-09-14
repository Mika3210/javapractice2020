package ru.Mika3210.javapractice2020.pr1.Ex3;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            double var=1.0/i;
            String mes=String.format("%.2f",var);
            System.out.println(mes);
        }
    }
}
