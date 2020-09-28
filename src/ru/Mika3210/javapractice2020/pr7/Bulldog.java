package ru.Mika3210.javapractice2020.pr7;

class Bulldog extends Dog{
    private int age;
    private String gender;

    public Bulldog(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    void barking() {
    }
}
