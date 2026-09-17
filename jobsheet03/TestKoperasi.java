package jobsheet03;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("11333444", "Donny", 5000000);

        System.out.println("Nama Anggota : " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimit());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMembayar Angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMembayar angsuran 150.000");
        anggota1.angsur(150000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());
    }
}
