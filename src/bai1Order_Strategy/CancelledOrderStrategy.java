package bai1Order_Strategy;

public class CancelledOrderStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}