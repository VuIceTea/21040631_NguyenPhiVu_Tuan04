package bai1Order_State;

public class CancelledOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}