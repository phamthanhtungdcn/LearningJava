package LibraryManagement;

import java.util.ArrayList;

public class Member {
    private String maThanhVien;
    private String ten;
    private ArrayList<Book> sachDangMuon;

    public Member(String maThanhVien, String ten) {
        this.maThanhVien = maThanhVien;
        this.ten = ten;
        this.sachDangMuon = new ArrayList<>();
    }

    public String getMaThanhVien() {
        return maThanhVien;
    }

    public String getTen() {
        return ten;
    }

    public ArrayList<Book> getSachDangMuon() {
        return sachDangMuon;
    }

    public void muonSach(Book book) {
        sachDangMuon.add(book);
    }

    public void traSach(Book book) {
        sachDangMuon.remove(book);
    }
}
