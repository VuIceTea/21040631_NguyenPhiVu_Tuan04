package bai1Order_Strategy;

public class NewOrderStrategy implements OrderStrategy{
    @Override
    public void processOrder() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}
