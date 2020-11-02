package ru.Mika3210.javapractice2020.pr21.ex2;

public class ChairFactory implements Factory{
    @Override
    public VictorianChair createVictorian() {
        return (new VictorianChair());
    }

    @Override
    public MultiFunctionChair createMultiFunctionChair() {
        return (new MultiFunctionChair());
    }

    @Override
    public MagicChair createMagicChair() {
        return (new MagicChair());
    }
}
