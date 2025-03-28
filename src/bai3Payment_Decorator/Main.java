package bai3Payment_Decorator;
public class Main {
    public static void main(String[] args) {
        Payment payment = new BasicPayment();

        payment = new CreditCardPaymentDecorator(payment);
        payment = new ProcessingFeeDecorator(payment);
        payment = new DiscountDecorator(payment);
        payment.pay(100);

        payment = new PayPalPaymentDecorator(payment);
        payment.pay(200);
    }
}