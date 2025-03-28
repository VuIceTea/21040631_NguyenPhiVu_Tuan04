package bai3Payment_State;

public class CreditCardPaymentState implements PaymentState {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}