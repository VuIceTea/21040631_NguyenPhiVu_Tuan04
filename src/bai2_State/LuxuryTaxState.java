package bai2_State;

public class LuxuryTaxState implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.3;
    }
}
