package bai1Order_Strategy;

public class ProcessingOrderStrategy implements OrderStrategy{
    @Override
    public void processOrder() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}
