package ru.Mika3210.javapractice2020.pr17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter ("notes.txt", false)){
            System.out.println("Введите что-нибудь:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            file.write(str);
            file.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("notes.txt")){
            System.out.println("Ваши записи:");
            Scanner scanner_2 = new Scanner(reader);
            while (scanner_2.hasNextLine()){
                System.out.println(scanner_2.nextLine());
            }
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileWriter file_2 = new FileWriter ("notes.txt", false)){
            System.out.println("Введите что-нибудь новое:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            file_2.write(str);
            file_2.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileWriter file_3 = new FileWriter ("notes.txt", true)){
            System.out.println("Введите что-нибудь, что добавить в конец:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            file_3.write(str);
            file_3.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try (FileReader reader_2 = new FileReader("notes.txt")){
            System.out.println("Ваши записи:");
            Scanner scanner_2 = new Scanner(reader_2);
            while (scanner_2.hasNextLine()){
                System.out.println(scanner_2.nextLine());
            }
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
