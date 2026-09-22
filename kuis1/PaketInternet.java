package kuis1;

public class PaketInternet {
    private String kodePaket; 
    private double kuotaMB; 
    private double harga;
    private boolean statusAktif; 

    public PaketInternet(String kodePaket, double kuotaMB, double harga) {
        if (kuotaMB <= 0) {
            System.out.println("Kuota awal harus lebih dari 0! Kuota diset default ke 100 MB");
            this.kuotaMB = 100;
        } else {
            this.kuotaMB = kuotaMB;
        }

        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif! Harga diset ke 0");
            this.harga = 0;
        } else {
            this.harga = harga;
        }

        this.kodePaket = kodePaket;
        this.statusAktif = false; 
    }

    public String getKodePaket() {
        return kodePaket;
    }

    public double getSisaKuota() {
        return kuotaMB;
    }

    public boolean isAktif() {
        return statusAktif;
    }

    public void aktifkanPaket() {
        this.statusAktif = true;
        System.out.println("Paket " + kodePaket + " berhasil DIAKTIFKAN");
    }

    public void nonaktifkanPaket() {
        this.statusAktif = false;
        System.out.println("Paket " + kodePaket + " telah DINONAKTIFKAN");
    }

    public void gunakanKuota(double jumlahMB) {
        if (jumlahMB <= 0) {
            System.out.println("Penggunaan kuota pada paket " + kodePaket + " harus bernilai positif!");
            return;
        }

        if (!statusAktif) {
            System.out.println("Penggunaan kuota ditolak! Paket " + kodePaket + " dalam keadaan NONAKTIF");
            return;
        }

        if (jumlahMB > kuotaMB) {
            System.out.println("Penggunaan kuota (" + jumlahMB + " MB) melebihi sisa kuota tersisa (" + kuotaMB + " MB) pada paket " + kodePaket);
            return;
        }

        this.kuotaMB -= jumlahMB;
        System.out.println("Menggunakan " + jumlahMB + " MB dari paket " + kodePaket + ". Sisa kuota: " + kuotaMB + " MB");
    }

    public void tampilkanStatus() {
        String statusStr = statusAktif ? "AKTIF" : "NONAKTIF";
        System.out.println("Kode Paket: " + kodePaket + " | Sisa Kuota: " + kuotaMB + " MB | Status: " + statusStr + " | Harga: Rp" + harga);
    }
}
