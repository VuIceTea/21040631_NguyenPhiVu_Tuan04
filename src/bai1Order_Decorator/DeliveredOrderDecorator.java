package bai1Order_Decorator;

public class DeliveredOrderDecorator extends OrderDecorator {
    public DeliveredOrderDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}