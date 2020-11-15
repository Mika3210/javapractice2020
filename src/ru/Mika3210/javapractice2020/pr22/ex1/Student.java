package ru.Mika3210.javapractice2020.pr22.ex1;

public class Student {
    private double number;
    private int idNum;
    private String date;

    public Student(String date) {
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString(String str) {
        String[] figure = date.split("/");
        char[] tmp = figure[2].toCharArray();
        if (str.equals("1")){
            return figure[0] + "/" + figure[1] + "/" + tmp[2] + tmp[3];
        }
        if (str.equals("2")){
            return figure[0] + "/" + figure[1] + "/" + figure[2];
        }
        if (str.equals("3")){
            switch (figure[1]){
                case "01" : return figure[0] + " января " + figure[2];
                case "02" : return figure[0] + " февраля " + figure[2];
                case "03" : return figure[0] + " марта " + figure[2];
                case "04" : return figure[0] + " апреля " + figure[2];
                case "05" : return figure[0] + " мая " + figure[2];
                case "06" : return figure[0] + " июня " + figure[2];
                case "07" : return figure[0] + " июля " + figure[2];
                case "08" : return figure[0] + " августа " + figure[2];
                case "09" : return figure[0] + " сентября " + figure[2];
                case "10" : return figure[0] + " октбяря " + figure[2];
                case "11" : return figure[0] + " ноября " + figure[2];
                case "12" : return figure[0] + " декабря " + figure[2];
            }
        }
        return null;
    }
}
