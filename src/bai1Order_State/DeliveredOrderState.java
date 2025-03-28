package bai1Order_State;

public class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}