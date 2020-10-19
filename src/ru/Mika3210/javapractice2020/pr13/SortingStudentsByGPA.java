package ru.Mika3210.javapractice2020.pr13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getNumber()< s2.getNumber())
            return 1;
        else if(s1.getNumber()> s2.getNumber())
            return -1;
        else
            return 0;
    }
}
