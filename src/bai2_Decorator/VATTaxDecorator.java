package bai2_Decorator;

public class VATTaxDecorator extends ProductDecorator {
    public VATTaxDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }
}