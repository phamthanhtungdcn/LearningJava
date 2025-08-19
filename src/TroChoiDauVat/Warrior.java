package TroChoiDauVat;

public class Warrior extends Character {
    public Warrior(String ten, int mau, int sucManh) {
        super(ten, mau, sucManh);
    }

    @Override
    public void tanCong(Character doiThu) {
        int satThuong = this.sucManh + 10;
        System.out.println(this.ten + " tan cong vat ly, gay sat thuong " + satThuong + " len " + doiThu.getTen());
        doiThu.nhanSatThuong(satThuong);
    }
}
