package bai3Payment_Decorator;

public class PayPalPaymentDecorator extends PaymentDecorator {
    public PayPalPaymentDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        super.pay(amount);
        System.out.println("Processing PayPal payment of $" + amount);
    }
}