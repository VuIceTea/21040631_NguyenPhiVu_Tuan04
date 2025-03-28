package bai1Order_Strategy;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.setStrategy(new NewOrderStrategy());
        order.executeStrategy();

        order.setStrategy(new ProcessingOrderStrategy());
        order.executeStrategy();

        order.setStrategy(new DeliveredOrderStrategy());
        order.executeStrategy();

        order.setStrategy(new CancelledOrderStrategy());
        order.executeStrategy();
    }
}
