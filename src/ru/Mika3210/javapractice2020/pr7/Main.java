package ru.Mika3210.javapractice2020.pr7;

public class Main {
    public static void main(String[] args) {
        Teapot teapot = new Teapot(2,"ceramics"){};
        Plate plate = new Plate(3,"pink"){};
        System.out.println(teapot.toString());
        System.out.println(plate.toString());
        System.out.println();
        Corgi corgi = new Corgi(40,4){};
        Bulldog bulldog = new Bulldog(3,"boy"){};
        System.out.println(corgi.toString());
        System.out.println(bulldog.toString());
        System.out.println();
        Sofa sofa = new Sofa(10,"Black"){};
        Table table = new Table(1,"Birch"){};
        System.out.println(sofa.toString());
        System.out.println(table.toString());
        System.out.println();
        Sofa[] sofas = new Sofa[3];
        Table[] tables = new Table[2];
        FurnitureShop furnitureShop = new FurnitureShop(sofas, tables){};
        sofas[0] = new Sofa(9, "Grey");
        sofas[1] = new Sofa(8, "Green");
        sofas[2] = new Sofa(11, "Blue");
        tables[0] = new Table(1, "Oak");
        tables[1] = new Table(1, "Fir");
        System.out.println(furnitureShop.toString());
    }
}
