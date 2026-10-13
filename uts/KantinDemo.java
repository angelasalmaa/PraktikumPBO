package uts;

public class KantinDemo {
    public static void main(String[] args) {
        KartuKantin kartu1 = new KartuKantin("K001");
        KartuKantin kartu2 = new KartuKantin("K002");

        System.out.println("Status Awal");
        kartu1.cetakStatus();
        kartu2.cetakStatus();

        System.out.println("\nUji pengisian saldo berhasil");
        kartu1.isiSaldo(200000);
        kartu1.cetakStatus();

        System.out.println("\nUji pengisian saldo negatif");
        System.out.println("[Sebelum] "); kartu1.cetakStatus();
        kartu1.isiSaldo(0);
        kartu1.isiSaldo(-1000);
        System.out.println("[Sesudah] "); kartu1.cetakStatus();

        System.out.println("\nUji pembayaran berhasil");
        System.out.println("[Sebelum] "); kartu1.cetakStatus();
        kartu1.bayar(25000);
        System.out.println("[Sesudah] "); kartu1.cetakStatus();

        System.out.println("\nUji pembayaran gagal (Saldo tidak cukup)");
        kartu2.isiSaldo(15000);
        System.out.println("[Sebelum] "); kartu2.cetakStatus();
        kartu2.bayar(20000);
        System.out.println("[Sesudah] "); kartu2.cetakStatus();
    }
}
