package HeThongThanhToan;

public class ChuyenKhoanNganHang implements PhuongThucThanhToan{
    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toan " + soTien + " bang Chuyen Khoan Ngan Hang");
    }
}
