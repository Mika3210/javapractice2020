package ru.Mika3210.javapractice2020.pr21.ex1;

public abstract class Factory implements ComplexFactory{
    public Complex create(){
        return new Complex();
    }
    public Complex create(int re, int im){
        return new Complex(re, im);
    }
}
