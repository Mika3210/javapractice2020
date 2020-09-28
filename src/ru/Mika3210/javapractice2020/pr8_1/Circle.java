package ru.Mika3210.javapractice2020.pr8_1;

import java.awt.*;

public class Circle extends Shape {
    protected int radius;

    public Circle(int radius, int centerX, int centerY) {
        super.generateXY(centerX, centerY);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D a) {
        a.drawRoundRect(centerX, centerY, radius*2, radius*2, 10000, 10000);
    }
}
