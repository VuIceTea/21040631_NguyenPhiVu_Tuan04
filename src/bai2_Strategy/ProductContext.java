package bai2_Strategy;

public class ProductContext {
    private TaxStrategy strategy;

    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyTax(double price) {
        return strategy.calculateTax(price);
    }
}
