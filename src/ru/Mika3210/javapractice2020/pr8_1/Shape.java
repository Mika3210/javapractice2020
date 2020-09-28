package ru.Mika3210.javapractice2020.pr8_1;

import java.awt.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected int centerX;
    protected int centerY;

    public Shape(){}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void generateXY(int x, int y){
        centerX=x;
        centerY=y;
    }
    public abstract void draw(Graphics2D a);

}
