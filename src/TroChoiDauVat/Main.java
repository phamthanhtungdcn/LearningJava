package TroChoiDauVat;

public class Main {
    public static void main(String[] args) {
        Character chienBinh = new Warrior("Arthas", 200, 30);
        Character phapSu = new Mage("Jaina", 150, 40);

        System.out.println("--- Tran dau bat dau ---");
        while (chienBinh.conSong() && phapSu.conSong()){
            chienBinh.tanCong(phapSu);
            if (!phapSu.conSong()){
                break;
            }
            phapSu.tanCong(chienBinh);

            System.out.println(chienBinh.getTen() + " con " + chienBinh.getMau() + " mau.");
            System.out.println(phapSu.getTen() + " con " + phapSu.getMau() + " mau.");
            System.out.println("---");
        }

        String nguoiThang = chienBinh.conSong() ? chienBinh.getTen() :  phapSu.getTen();
        System.out.println("Tran dau ket thuc! Nguoi chien thang la: " + nguoiThang);
    }
}
