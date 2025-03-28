package bai1Order_Decorator;

public class NewOrderDecorator extends OrderDecorator {
    public NewOrderDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}