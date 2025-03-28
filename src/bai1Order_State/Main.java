package bai1Order_State;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.processOrder();
        order.processOrder();
        order.setState(new CancelledOrderState());
        order.processOrder();
    }
}
