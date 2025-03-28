package bai3Payment_Decorator;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double discount = amount * 0.1;
        super.pay(amount - discount);
        System.out.println("Applied discount of $" + discount);
    }
}