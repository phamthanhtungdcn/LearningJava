package LibraryManagement;

public class Book {
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private boolean daChoMuon;

    public Book(String tieuDe, String tacGia, int namXuatBan) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.daChoMuon = false;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public boolean isDaChoMuon() {
        return daChoMuon;
    }

    public void setDaChoMuon(boolean daChoMuon) {
        this.daChoMuon = daChoMuon;
    }
}
