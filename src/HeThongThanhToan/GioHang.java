package HeThongThanhToan;

public class GioHang {
    private double tongTien;

    public GioHang(double tongTien) {
        this.tongTien = tongTien;
    }

    public void thanhToan(PhuongThucThanhToan phuongThuc){
        System.out.println("Dang xu ly thanh toan cho gio hang voi tong so tien la: " + tongTien);
        phuongThuc.thanhToan(tongTien);
        System.out.println("Thanh toan hoan tat.");
    }
}
