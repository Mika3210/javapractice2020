package ru.Mika3210.javapractice2020.pr1.Ex4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int k;
        for (int i = 0; i < 5; i++) {
            for (int j =0; j <4; j++) {
                if (array[j] > array[j+1]) {
                    k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        int[] barray = new int[5];
        for (int i = 0; i < 5; i++) {
            barray[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(barray[i]+" ");
        }
        System.out.println();
        int p;
        for (int i = 0; i < 5; i++) {
            for (int j =0; j <4; j++) {
                if (barray[j] > barray[j+1]) {
                    p = barray[j];
                    barray[j] = barray[j+1];
                    barray[j+1] = p;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(barray[i]+" ");
        }
    }
}
