package ru.Mika3210.javapractice2020.pr7;

class Corgi extends Dog{
    private int height;
    private int age;

    public Corgi(int height, int age) {
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Corgi{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    void barking() {
    }
}
