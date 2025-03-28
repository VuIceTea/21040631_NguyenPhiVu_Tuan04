package bai1Order_Decorator;

public class ProcessingOrderDecorator extends OrderDecorator{
    public ProcessingOrderDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Đóng gói và vận chuyển.");
    }
}
