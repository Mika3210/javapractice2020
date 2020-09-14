package ru.Mika3210.javapractice2020.pr3.Ex2;

public class Head {
    private String hairJLength;
    private String eyesColor;

    public Head(String hairJLength, String eyesColor) {
        this.hairJLength = hairJLength;
        this.eyesColor = eyesColor;
    }

    public String getHairJLength() {
        return hairJLength;
    }

    public void setHairJLength(String hairJLength) {
        this.hairJLength = hairJLength;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
