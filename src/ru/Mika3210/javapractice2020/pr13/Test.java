package ru.Mika3210.javapractice2020.pr13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student student_1 = new Student(4, 0);
        Student student_2 = new Student(3.5, 2);
        Student student_3 = new Student(5, 1);

        students.add(student_1);
        students.add(student_2);
        students.add(student_3);

        ArrayList<Student> students2 = new ArrayList<Student>();

        Student student2_1 = new Student(2.4, 3);
        Student student2_2 = new Student(1.8, 5);
        Student student2_3 = new Student(4.5, 4);

        students2.add(student2_1);
        students2.add(student2_2);
        students2.add(student2_3);

        students.addAll(students2);

        SortingStudentsByGPA myComparator = new SortingStudentsByGPA();
        students.sort(myComparator);
        System.out.println("Sorted_1: ");
        for (Student s: students) {
            System.out.println(s);
        }
        System.out.println();

        SortingStudentsByiDNumb myComparator2 = new SortingStudentsByiDNumb();
        students.sort(myComparator2);

        System.out.println("Sorted_2: ");
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
