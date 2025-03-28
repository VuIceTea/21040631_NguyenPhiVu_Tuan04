package bai3Payment_Decorator;

public class BasicPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing basic payment of $" + amount);
    }
}