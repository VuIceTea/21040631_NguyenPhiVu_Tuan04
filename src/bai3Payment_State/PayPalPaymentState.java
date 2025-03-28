package bai3Payment_State;

public class PayPalPaymentState implements PaymentState {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}