package TroChoiDauVat;

public class Mage extends Character {
    public Mage(String ten, int mau, int sucManh) {
        super(ten, mau, sucManh);
    }

    @Override
    public void tanCong(Character doiThu) {
        int satThuong = this.sucManh + 20;
        System.out.println(this.ten + " tan cong phep thuat, gay sat thuong " + satThuong + " len " + doiThu.getTen());
        doiThu.nhanSatThuong(satThuong);
    }
}
