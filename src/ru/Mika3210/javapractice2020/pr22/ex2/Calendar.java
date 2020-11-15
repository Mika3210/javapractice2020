package ru.Mika3210.javapractice2020.pr22.ex2;

public class Calendar {
    private String calendar;
    private String hour;
    private String min;

    public Calendar(String calendar) {
        this.calendar = calendar;
        calendar_time();
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "hour='" + hour + '\'' +
                ", min='" + min + '\'' +
                '}';
    }

    public void calendar_time(){
        String[] str = calendar.split(">");
        char[] tmp = str[0].toCharArray();
        hour = String.valueOf(tmp[1]) + String.valueOf(tmp[2]) ;
        tmp = str[1].toCharArray();
        min = String.valueOf(tmp[1]) + String.valueOf(tmp[2]);
    }
}
