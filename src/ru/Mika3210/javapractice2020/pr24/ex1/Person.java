package ru.Mika3210.javapractice2020.pr24.ex1;

public class Person {
    private String fio;

    public Person(String fio) {
        this.fio = fio;
    }
    public String Return(){
        try{
            String str[] = fio.split(" ");
            char[] a = str[1].toCharArray();
            char[] b = str[2].toCharArray();
            return str[0]+" "+a[0]+"."+b[0]+".";
        }
        catch (Exception ex){
            return "Ошибка";
        }
    }
}
