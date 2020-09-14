package ru.Mika3210.javapractice2020.pr2.Ex2;

import ru.Mika3210.javapractice2020.pr2.Ex2.Ball;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(13, "black");
        ball.setColor("white");
        System.out.println(ball.getVolume());
        System.out.println(ball.getColor());
        System.out.println(ball.toString());

    }
}
