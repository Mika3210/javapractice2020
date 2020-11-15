package ru.Mika3210.javapractice2020.pr22.ex2;

public class Date {
    private String date;
    private String day;
    private String month;
    private String year;

    public Date(String date) {
        this.date=date;
        date_calendar();
    }

    @Override
    public String toString() {
        return "Date{" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public void date_calendar(){
        String[] str = date.split(">");
        char[] tmp = str[0].toCharArray();
        day = String.valueOf(tmp[1]) + String.valueOf(tmp[2]) ;
        tmp = str[1].toCharArray();
        month = String.valueOf(tmp[1]) + String.valueOf(tmp[2]);
        tmp = str[2].toCharArray();
        year = String.valueOf(tmp[1]) + String.valueOf(tmp[2]) + String.valueOf(tmp[3]) + String.valueOf(tmp[4]);
    }
}
