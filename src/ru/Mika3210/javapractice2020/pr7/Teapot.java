package ru.Mika3210.javapractice2020.pr7;

class Teapot extends Dish{
    private int volume;
    private String material;

    public Teapot(int volume, String material) {
        this.volume = volume;
        this.material = material;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    void uplift() {
    }
}
