package LibraryManagement;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> danhSachSach;
    private ArrayList<Member> danhSachThanhVien;

    public Library() {
        this.danhSachSach = new ArrayList<>();
        this.danhSachThanhVien = new ArrayList<>();
    }

    // 1. Add new Book
    public void themSach(Book book) {
        danhSachSach.add(book);
        System.out.println("Da them sach: " + book.getTieuDe());
    }

    // 2. Add new member
    public void themThanhVien(Member member) {
        danhSachThanhVien.add(member);
        System.out.println("Da them thanhn vien: " + member.getTen());
    }

    // 3.Find book
    public Book findBook(String tieuDe) {
        for (Book book : danhSachSach) {
            if (book.getTieuDe().equals(tieuDe)) {
                return book;
            }
        }
        System.out.println("Khong tim thay sach co tieu de: " + tieuDe);
        return null;
    }

    // 4.Find member
    public Member findMember(String maThanhVien) {
        for (Member member : danhSachThanhVien) {
            if (member.getMaThanhVien().equals(maThanhVien)) {
                return member;
            }
        }
        System.out.println("Khong tim thay thanh vien nao co ma: " + maThanhVien);
        return null;
    }

    // 5.Cho muon sach
    public void choMuonSach(String maThanhVien, String tieuDe) {
        Member member = findMember(maThanhVien);
        Book book = findBook(tieuDe);
        if(member != null && book != null) {
            if (!book.isDaChoMuon()) {
                member.muonSach(book);
                book.setDaChoMuon(true);
                System.out.println(member.getTen() + " da muon thanh cong sach: " + book.getTieuDe());
            } else {
                System.out.println("Sach '" + book.getTieuDe() + "' hien tai da co nguoi muon.");
            }
        }
    }

    // 6.Tra sach
    public void traSach(String maThanhVien, String tieuDe) {
        Member member = findMember(maThanhVien);
        Book book = findBook(tieuDe);

        if(member != null && book != null) {
            if (book.isDaChoMuon()) {
                member.traSach(book);
                book.setDaChoMuon(false);
                System.out.println(member.getTen() + " da tra thanh cong sach: " + book.getTieuDe());
            } else {
                System.out.println("Sach '" + book.getTieuDe() + "' hien tai dang co san trong thu vien, khong the tra.");
            }
        }
    }
}
