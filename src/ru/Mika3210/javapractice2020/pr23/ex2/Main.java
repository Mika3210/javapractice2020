package ru.Mika3210.javapractice2020.pr23.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Волгоград");
        arr1.add("Москва");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Токио");
        arr2.add("Киото");
        map.put("Россия", arr1);
        map.put("Япония", arr2);
        System.out.println(map.get("Россия"));
        System.out.println(map.get("Япония"));
    }
}
