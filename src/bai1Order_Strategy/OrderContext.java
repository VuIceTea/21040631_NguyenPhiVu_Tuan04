package bai1Order_Strategy;

public class OrderContext {
    private OrderStrategy strategy;

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.processOrder();
    }
}
