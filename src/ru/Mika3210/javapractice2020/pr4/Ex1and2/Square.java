package ru.Mika3210.javapractice2020.pr4.Ex1and2;

class Square extends Rectangle{
    double side;
    String color;
    boolean filled;

    public Square() {
    }
    public Square(double side){
        this.side=side;
    }

    public Square(double side, String color, boolean filled) {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "Square:\nS= "+getArea()+"\nP= "+getPerimeter()+"\nColor= "+getColor()+"\nIsFilled?="+isFilled();
    }

}
