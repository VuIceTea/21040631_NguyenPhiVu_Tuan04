package bai1Order_Strategy;

public class DeliveredOrderStrategy implements OrderStrategy{
    @Override
    public void processOrder() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
