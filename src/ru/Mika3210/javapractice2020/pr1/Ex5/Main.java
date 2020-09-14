package ru.Mika3210.javapractice2020.pr1.Ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println(Met(3));
    }
    public static int Met(int n){
        int s=1;
        for (int i = 1; i <= n; i++) {
            s=s*i;
        }
        return s;
    }
}
