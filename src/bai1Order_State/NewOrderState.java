package bai1Order_State;

public class NewOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Kiểm tra thông tin đơn hàng.");
        context.setState(new ProcessingOrderState());
    }
}