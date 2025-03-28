package bai2_State;

public class VATTaxState implements  TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
