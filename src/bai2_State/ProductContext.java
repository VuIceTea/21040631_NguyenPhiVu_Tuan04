package bai2_State;

public class ProductContext {
    private TaxState state;

    public void setState(TaxState state) {
        this.state = state;
    }

    public double applyTax(double price) {
        return state.calculateTax(price);
    }
}
