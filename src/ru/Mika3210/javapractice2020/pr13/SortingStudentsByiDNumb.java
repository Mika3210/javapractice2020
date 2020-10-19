package ru.Mika3210.javapractice2020.pr13;

import java.util.Comparator;

public class SortingStudentsByiDNumb implements Comparator <Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getIdNum()> s2.getIdNum())
            return 1;
        else if(s1.getIdNum()< s2.getIdNum())
            return -1;
        else
            return 0;
    }
}
