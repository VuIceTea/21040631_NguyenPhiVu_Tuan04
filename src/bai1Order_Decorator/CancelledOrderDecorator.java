package bai1Order_Decorator;

public class CancelledOrderDecorator extends OrderDecorator {
    public CancelledOrderDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}