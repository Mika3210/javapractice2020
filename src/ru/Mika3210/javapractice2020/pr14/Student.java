package ru.Mika3210.javapractice2020.pr14;

public class Student implements Test{
    private double number;
    private int idNum;

    public Student(double number, int idNum) {
        this.number = number;
        this.idNum = idNum;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", idNum=" + idNum +
                '}';
    }


}