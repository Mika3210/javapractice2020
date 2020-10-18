package ru.Mika3210.javapractice2020.pr12;

public enum Planet {
    Mercury(3300000, 2400),
    Venus (4900000, 6100),
    Earth(6000000, 6400),
    Mars (6400000, 3400),
    Jupiter (1900000, 7100),
    Saturn (5700000, 6000),
    Uranus (8700000, 2600),
    Neptune (1000000, 2500);

    public int mass;
    public int radius;

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }
}
