package bai1Order_Decorator;

public class Main {
    public static void main(String[] args) {
        Order order = new BasicOrder();

        order = new NewOrderDecorator(order);
        order.processOrder();

        order = new ProcessingOrderDecorator(order);
        order.processOrder();

        order = new DeliveredOrderDecorator(order);
        order.processOrder();

        order = new CancelledOrderDecorator(order);
        order.processOrder();
    }
}
