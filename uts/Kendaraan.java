package uts;

public class Kendaraan {
    private String plat;
    private boolean isParkir;
    private int waktuMasuk;

    
    public Kendaraan(String plat) {
        this.plat = plat;
        this.isParkir = false;
    }

    public void masuk(int waktu) {
        if (isParkir) {
            System.out.println("GAGAL! Kendaraan " + plat + " sudah berada di area parkir.");
            return;
        }

        if (waktu < 0 || waktu > 23) {
            System.out.println("GAGAL! Format waktu masuk (" + waktu + ") tidak valid. Gunakan 0-23.");
            return;
        }

        this.waktuMasuk = waktu;
        this.isParkir = true;
        System.out.println("BERHASIL! Kendaraan " + plat + " masuk pada jam " + waktu + ". Status: Parkir.");
    }
    
    public void keluar(int waktuKeluar) {
        if (!isParkir) {
            System.out.println("GAGAL! Kendaraan " + plat + " belum masuk, tidak bisa melakukan proses keluar.");
            return;
        }

        if (waktuKeluar < 0 || waktuKeluar > 23) {
            System.out.println("GAGAL! Format waktu keluar (" + waktuKeluar + ") tidak valid. Gunakan 0-23.");
            return;
        }

        if (waktuKeluar < waktuMasuk) {
            System.out.println("GAGAL! Waktu keluar (" + waktuKeluar + ") lebih awal dari waktu masuk (" + waktuMasuk + ") untuk kendaraan: " + plat + ".");
            return;
        }

        int durasi = waktuKeluar - waktuMasuk;
        int biaya = 0;

        if (durasi <= 2) {
            biaya = 3000;
        } else {
            biaya = 3000 + ((durasi -2) * 2000);
        }

        this.isParkir = false;
        System.out.println("BERHASIL! Kendaraan " + plat + " keluar. Durasi parkir: " + (durasi == 0 ? "<1" : durasi) + " jam. Biaya: Rp" + biaya + ". Status: Keluar.");
    }
}