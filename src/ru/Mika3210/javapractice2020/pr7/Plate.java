package ru.Mika3210.javapractice2020.pr7;

class Plate extends Dish{
    private int area;
    private String color;

    public Plate(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "area=" + area +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    void uplift() {
    }
}
