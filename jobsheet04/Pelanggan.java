package jobsheet04;

import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> daftarPesanan;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.daftarPesanan = new ArrayList<Pesanan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPesanan(Pesanan pesanan) {
        daftarPesanan.add(pesanan);
    }

    public ArrayList<Pesanan> getPesananList() {
        return daftarPesanan;
    }

    public String getTransaksi() {
        String info = "";
        info += "ID Pelanggan   : " + this.idPelanggan + "\n";
        info += "Nama Pelanggan : " + this.nama + "\n";

        if (daftarPesanan.isEmpty()) {
            info += "Belum ada pesanan";
        } else {
            for (Pesanan pesanan : daftarPesanan) {
                info += "\nID Pesanan     : " + pesanan.getIdPesanan() + "\n";
                info += "Tanggal        : " + pesanan.getTanggal() + "\n";
                for (Menu menu : pesanan.getMenuList()) {
                    info += " - " + menu.getMenuInfo() + "\n";
                }
                info += "Total Harga    : Rp" + pesanan.getTotalHarga() + "\n";
                info += "------------------------------------------\n";
            }
        }
        return info;
    }
}
