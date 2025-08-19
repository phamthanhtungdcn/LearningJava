package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Them sach
        Book book1 = new Book("Dac Nhan Tam", "Dale Carnegie", 1936);
        Book book2 = new Book("Nha Gia Kim", "Paulo Coelho", 1988);
        library.themSach(book1);
        library.themSach(book2);

        System.out.println("\n");

        // Them member
        Member member1 = new Member("TV001", "Nguyen Van A");
        Member member2 = new Member("TV002", "Tran Thi B");
        library.themThanhVien(member1);
        library.themThanhVien(member2);

        System.out.println("\n");

        // Cho muon sach
        library.choMuonSach("TV001", "Dac Nhan Tam");
        library.choMuonSach("TV002", "Dac Nhan Tam");

        System.out.println("\n");

        // Kiem tra trang thai sach
        Book sachDaMuon = library.findBook("Dac Nhan Tam");
        if (sachDaMuon != null) {
            System.out.println("Trang thai sach '" + sachDaMuon.getTieuDe() + "': " + (sachDaMuon.isDaChoMuon() ? "Da cho muon" : "San sang"));
        }

        System.out.println("\n");

        // Tra sach
        library.traSach("TV001", "Dac Nhan Tam");

        // Kiem tra lai trang thai sach sau khi tra
        Book sachDaTra = library.findBook("Dac Nhan Tam");
        if (sachDaTra != null) {
            System.out.println("Trang thai sach '" + sachDaTra.getTieuDe() + "' sau khi tra: " + (sachDaTra.isDaChoMuon() ? "Da cho muon" : "San sang"));
        }

    }
}
