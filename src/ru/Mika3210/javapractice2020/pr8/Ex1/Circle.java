package ru.Mika3210.javapractice2020.pr8.Ex1;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius, double centerX, double centerY) {
        super.generateXY((int)centerX, (int)centerY);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D a) {
        a.drawRoundRect(centerX, centerY, (int)radius*2, (int)radius*2, 10000, 10000);
    }
}
