package ru.Mika3210.javapractice2020.pr4.Ex1and2;

class Rectangle extends Shape
{
    double width;
    double length;

    public Rectangle() { }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean isFilled)
    {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = isFilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString()
    {
        return "Rectangle:\nS= "+getArea()+"\nP= "+getPerimeter()+"\nColor= "+getColor()+"\nIsFilled?="+isFilled();
    }
}
