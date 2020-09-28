package ru.Mika3210.javapractice2020.pr7;

class Table extends Furniture {
    private int height;
    private String tree;

    public Table(int height, String tree) {
        this.height = height;
        this.tree = tree;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", tree='" + tree + '\'' +
                '}';
    }

    @Override
    void move() {
    }
}
