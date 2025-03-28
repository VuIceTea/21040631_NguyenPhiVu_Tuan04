package bai2_Decorator;

public class ConsumptionTaxDecorator extends ProductDecorator {
    public ConsumptionTaxDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}