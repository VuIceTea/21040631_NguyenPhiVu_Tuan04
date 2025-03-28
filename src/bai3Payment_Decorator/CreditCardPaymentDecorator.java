package bai3Payment_Decorator;

public class CreditCardPaymentDecorator extends PaymentDecorator {
    public CreditCardPaymentDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        super.pay(amount);
        System.out.println("Processing credit card payment of $" + amount);
    }
}