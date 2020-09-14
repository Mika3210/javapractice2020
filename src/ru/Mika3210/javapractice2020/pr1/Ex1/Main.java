package ru.Mika3210.javapractice2020.pr1.Ex1;

public class Main {
    public static void main(String[] args) {
        int[] array = {13, 17, 3, 7};
        int s = 0, s1 = 0, s2 = 0;
        for (int i = 0; i < array.length; i++) {
            s = s + array[i];
        }
        System.out.println(s);
        int p = 0;
        while (p < array.length) {
            s1 += array[p];
            p++;
        }
        System.out.println(s1);
        int k = 0;
        do {
            s2 += array[k];
            k++;
        }
        while (k < array.length);
        System.out.println(s2);
    }
}
