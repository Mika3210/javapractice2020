package ru.Mika3210.javapractice2020.pr27.ex1;

public class Operation {
    private int result;
    public void addResult(int a, int b, char action){
        try{
            switch (action){
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("infinity");
                    }
                    break;
                default: throw new Exception();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int getResult() {
        return result;
    }
}
