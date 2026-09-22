package kuis1;

public class LayananAkademik {
    private String noAntrian;
    private String nama;
    private String nim;
    private String jenisLayanan;
    private String status;

    public LayananAkademik(String noAntrian, String nama, String nim, String jenisLayanan) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this. nim = nim;
        this.jenisLayanan = jenisLayanan;
        this.status = "MENUNGGU";
    }

    public String getNoAntrian() {
        return noAntrian;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public String getStatus() {
        return status;
    }

    public void melayani() {
        if (this.status.equals("MENUNGGU")) {
            this.status = "DILAYANI";
            System.out.println("Antrian " + noAntrian + " sedang DILAYANI");
        } else if (this.status.equals("BATAL")) {
            System.out.println("Antrian " + noAntrian + " telah BATAL dan tidak dapat diproses");
        } else if (this.status.equals("SELESAI")) {
            System.out.println("Antrian " + noAntrian + " sudah SELESAI, tidak bisa kembali DILAYANI");
        } else {
            System.out.println("Antrian " + noAntrian + " sudah dalam proses DILAYANI");
        }
    }

    public void selesaikan() {
        if (this.status.equals("DILAYANI")) {
            this.status = "SELESAI";
            System.out.println("Antrian " + noAntrian + " telah SELESAI");
        } else if (this.status.equals("MENUNGGU")) {
            System.out.println("Antrian " + noAntrian + " masih MENUNGGU, harus DILAYANI terlebih dahulu");
        } else {
            System.out.println("Antrian " + noAntrian + " tidak dapat diselesaikan karena status saat ini " + status);
        }
    }

    public void batalkan() {
        if (this.status.equals("MENUNGGU")) {
            this.status = "BATAL";
            System.out.println("Antrian " + noAntrian + " berhasil DIBATALKAN");
        } else {
            System.out.println("Antrian " + noAntrian + " ditolak, pembatalan hanya diperbolehkan saat status MENUNGGU (Status saat ini: " + status + ")");
        }
    }

    public void displayInfo() {
        System.out.println("Antrian: " + noAntrian + " | Nama: " + nama + " | NIM: " + nim + " | Layanan: " + jenisLayanan + " | Status: " + status);
    }
}
