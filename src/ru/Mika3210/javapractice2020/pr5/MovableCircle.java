package ru.Mika3210.javapractice2020.pr5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
}
