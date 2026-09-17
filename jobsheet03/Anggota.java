package jobsheet03;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limit;
    private int jumlahPinjam;

    public Anggota(String noKtp, String nama, int limit) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimit() {
        return limit;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjam + nominal > limit) {
            System.out.println("Maaf, julah pinjaman melebihi limit!");
        } else {
            jumlahPinjam += nominal;
        }
    }

    public void angsur(int nominal) {
        if (nominal < jumlahPinjam * 0.1) {
            System.out.println("Maaf, minimal angsuran harus 10% dari jumlah pinjaman");
        } else if (nominal > jumlahPinjam) {
            System.out.println("Angsuran tidak tidak boleh melebihi jumlah pinjaman!");
        } else {
            jumlahPinjam -= nominal;
        }
    }
}
