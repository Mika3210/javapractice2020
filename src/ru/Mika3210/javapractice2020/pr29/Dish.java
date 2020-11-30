package ru.Mika3210.javapractice2020.pr29;

public final class Dish {
    private String description;

    public Dish(String description) {
        try{
            this.description = description;
        }
        catch (IllegalArgumentException ex){
            if (description == null)
                System.out.println(ex);
        }
    }
}
