package bai2_State;

public class Main {
    public static void main(String[] args) {
        ProductContext product = new ProductContext();

        product.setState(new ConsumptionTaxState());
        System.out.println("Thuế tiêu thụ: " + product.applyTax(100));

        product.setState(new VATTaxState());
        System.out.println("Thuế giá trị gia tăng (VAT): " + product.applyTax(100));

        product.setState(new LuxuryTaxState());
        System.out.println("Thuế đặc biệt: " + product.applyTax(100));
    }
}
