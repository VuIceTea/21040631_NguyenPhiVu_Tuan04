package bai2_State;

public class ConsumptionTaxState implements  TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
