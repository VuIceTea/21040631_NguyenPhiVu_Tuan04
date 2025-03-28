package bai3Payment_State;

public class Main {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext();

        payment.setState(new CreditCardPaymentState());
        payment.pay(100);

        payment.setState(new PayPalPaymentState());
        payment.pay(200);
    }
}
