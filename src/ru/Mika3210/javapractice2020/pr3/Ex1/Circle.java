package ru.Mika3210.javapractice2020.pr3.Ex1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area() {
       return (Math.PI * radius * radius);
    }
}
