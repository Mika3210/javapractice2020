package ru.Mika3210.javapractice2020.pr28;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}