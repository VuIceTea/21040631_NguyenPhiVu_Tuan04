package bai1Order_Decorator;

public abstract class OrderDecorator implements Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order decoratedOrder) {
        this.decoratedOrder = decoratedOrder;
    }

    @Override
    public void processOrder() {
        decoratedOrder.processOrder();
    }
}
