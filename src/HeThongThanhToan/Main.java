package HeThongThanhToan;

public class Main {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang(150.75);

        System.out.println("--- Thuc hien thanh toan bang PayPal ---");
        PhuongThucThanhToan pp = new Paypal();
        gioHang.thanhToan(pp);

        System.out.println("\n--- Thay doi sang thanh toan bang Chuyen Khoan Ngan Hang ---");
        PhuongThucThanhToan ck = new ChuyenKhoanNganHang();
        gioHang.thanhToan(ck);

        System.out.println("\n--- Thay doi sang thanh toan bang The Tin Dung ---");
        PhuongThucThanhToan td = new TheTinDung();
        gioHang.thanhToan(td);
    }
}
