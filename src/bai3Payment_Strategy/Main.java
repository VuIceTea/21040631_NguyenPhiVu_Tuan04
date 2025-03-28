package bai3Payment_Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext();

        payment.setStrategy(new CreditCardPaymentStrategy());
        payment.pay(100);

        payment.setStrategy(new PayPalPaymentStrategy());
        payment.pay(200);
    }
}