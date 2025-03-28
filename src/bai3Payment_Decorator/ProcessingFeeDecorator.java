package bai3Payment_Decorator;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double fee = amount * 0.05;
        super.pay(amount + fee);
        System.out.println("Added processing fee of $" + fee);
    }
}