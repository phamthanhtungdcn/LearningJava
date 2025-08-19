package HeThongThanhToan;

public class TheTinDung implements PhuongThucThanhToan{
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toan " + soTien + " bang The Tin Dung");
    }
}
