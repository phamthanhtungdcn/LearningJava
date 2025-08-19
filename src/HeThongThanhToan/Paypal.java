package HeThongThanhToan;

public class Paypal implements PhuongThucThanhToan{
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toan " + soTien + " bang PayPal");
    }
}
