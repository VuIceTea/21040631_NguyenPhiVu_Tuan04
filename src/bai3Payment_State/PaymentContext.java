package bai3Payment_State;

public class PaymentContext {
    private PaymentState state;

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void pay(double amount) {
        state.processPayment(amount);
    }
}
