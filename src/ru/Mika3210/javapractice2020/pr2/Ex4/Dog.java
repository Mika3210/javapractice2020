package ru.Mika3210.javapractice2020.pr2.Ex4;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int Method(int age){
        int age2=age*7;
        return age2;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
