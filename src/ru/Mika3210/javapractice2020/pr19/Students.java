package ru.Mika3210.javapractice2020.pr19;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Student[] sts = new Student[5];
        sts[0] = new Student ("aaa", 4, 0);
        sts[1] = new Student ("bbb", 3.5, 2);
        sts[2] = new Student ("fff", 5.0, 1);
        sts[3] = new Student ("abc", 2.4, 3);
        sts[4] = new Student ("bas", 1.8, 5);
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        Double number = scanner.nextDouble();
        int idNum = scanner.nextInt();
        Student student = new Student(fio, number, idNum);
        try {
            if (!Search(sts, student)) {
                System.out.println("Found");
            }
            else {
                throw (new Exception());
            }
        } catch (Exception exe) {
            System.out.println("Not found");
        }
    }

    public static boolean Search(Student[] sts, Student student) {
        for (Student s1 : sts) {
            if (s1.compareTo(student)) {
                return true;
            }
        }
            return false;
    }
}
