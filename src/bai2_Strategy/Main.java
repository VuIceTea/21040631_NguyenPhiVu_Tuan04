package bai2_Strategy;

public class Main {
    public static void main(String[] args) {
        ProductContext product = new ProductContext();

        product.setStrategy(new ConsumptionTaxStrategy());
        System.out.println("Thuế tiêu thụ: " + product.applyTax(100));

        product.setStrategy(new VATTaxStrategy());
        System.out.println("Thuế giá trị gia tăng (VAT): " + product.applyTax(100));

        product.setStrategy(new LuxuryTaxStrategy());
        System.out.println("Thuế đặc biệt: " + product.applyTax(100));
    }
}
