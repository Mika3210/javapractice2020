package ru.Mika3210.javapractice2020.pr15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("one");
        arr1.add("two");
        arr1.add("three");
        for (String a: arr1){
            System.out.println(a);
        }

        System.out.println();

        LinkedList<String> arr2 = new LinkedList<String>();
        arr2.add("four");
        arr2.add("fife");
        arr2.add("six");
        for (String b: arr2){
            System.out.println(b);
        }

        System.out.println();

        ArrayList_2<String> arr3 = new ArrayList_2<String>();
        arr3.add("seven");
        arr3.add("eight");
        arr3.add("nine");
        for (int i=0;i<arr3.size();i++) {
            System.out.println(arr3.get(i));
        }
    }
}
