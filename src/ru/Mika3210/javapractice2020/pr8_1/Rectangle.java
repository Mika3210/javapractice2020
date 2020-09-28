package ru.Mika3210.javapractice2020.pr8_1;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int length;

    public Rectangle(int width, int length, int centerX, int centerY) {
        super.generateXY(centerX, centerY);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw(Graphics2D a) {
        a.drawRect(centerX, centerY, width, length);
    }
}
