package ru.Mika3210.javapractice2020.pr19;

public class Student {
    private String fio;
    private double number;
    private int iDNum;

    public Student(String fio, double number, int iDNum) {
        this.fio = fio;
        this.number = number;
        this.iDNum = iDNum;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getiDNum() {
        return iDNum;
    }

    public void setiDNum(int iDNum) {
        this.iDNum = iDNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", iDNum=" + iDNum +
                '}';
    }

    public boolean compareTo(Student student){
        if (student.getFio() == this.getFio()) return true;
        else return false;
    }
}
