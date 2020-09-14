package ru.Mika3210.javapractice2020.pr3.Ex2;

public class Human {
    public static void main(String[] args) {
        Head head = new Head("long", "grey");
        Leg leg = new Leg(37);
        Hand hand = new Hand("Yes");
        System.out.println("Hair length: "+head.getHairJLength()+"\nEyes colors: "+head.getEyesColor()+"\nLeg size: "+leg.getSize()+"\nKlock?: "+hand.getClock());

    }
}
