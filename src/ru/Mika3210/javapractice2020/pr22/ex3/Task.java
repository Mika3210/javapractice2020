package ru.Mika3210.javapractice2020.pr22.ex3;

import java.util.Date;

public class Task {
    private Date start;
    private Date finish;

    public void getStart(){
        Date start = new Date();
        long time = start.getTime();
        time = time + ( 1000 * 1000 * (-6));
        start = new Date(time);
        System.out.println("Задание взято: " + start);
    }

    public void getFinish(){
        Date finish = new Date();
        System.out.println("Задание сдано: " + finish);

    }
}
