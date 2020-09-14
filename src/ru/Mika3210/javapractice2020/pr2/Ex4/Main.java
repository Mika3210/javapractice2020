package ru.Mika3210.javapractice2020.pr2.Ex4;

public class Main {
    public static void main(String[] args) {
        Dog arr1 = new Dog(3,"Бобик");
        Dog arr2 = new Dog(5,"Шарик");
        Dog arr3 = new Dog(7,"Барбос");
        DogsHome home = new DogsHome();
        home.addDogs(arr1);
        home.addDogs(arr2);
        home.addDogs(arr3);
        home.list();
    }
}
