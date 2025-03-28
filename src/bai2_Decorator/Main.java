package bai2_Decorator;

public class Main {
    public static void main(String[] args) {
        Product product = new BasicProduct(100);

        product = new ConsumptionTaxDecorator(product);
        System.out.println("Thuế tiêu thụ: " + product.getPrice());

        product = new VATTaxDecorator(product);
        System.out.println("Thuế giá trị gia tăng (VAT): " + product.getPrice());

        product = new LuxuryTaxDecorator(product);
        System.out.println("Thuế đặc biệt: " + product.getPrice());
    }
}