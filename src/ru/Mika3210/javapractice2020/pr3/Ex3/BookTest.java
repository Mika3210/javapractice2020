package ru.Mika3210.javapractice2020.pr3.Ex3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Stiven King", "Pet Sematary", 1983);
        book.setName("It");
        book.setYear(1985);
        System.out.println("Author: "+book.getAuthor()+"\nName of book: "+book.getName()+"\nPublication year: "+book.getYear());
    }
}
