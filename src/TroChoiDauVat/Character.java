package TroChoiDauVat;

public abstract class Character {
    protected String ten;
    protected int mau;
    protected int sucManh;

    public Character(String ten, int mau, int sucManh) {
        this.ten = ten;
        this.mau = mau;
        this.sucManh = sucManh;
    }

    public abstract void tanCong(Character doiThu);

    public void nhanSatThuong(int satThuong){
        this.mau -= satThuong;
        if(this.mau <= 0){
            this.mau = 0;
        }
    }

    public boolean conSong(){
        return mau > 0;
    }

    public String getTen() {
        return ten;
    }

    public int getMau() {
        return mau;
    }
}
