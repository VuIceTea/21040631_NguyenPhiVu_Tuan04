package bai2_Decorator;

public class LuxuryTaxDecorator extends ProductDecorator {
    public LuxuryTaxDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.3;
    }
}