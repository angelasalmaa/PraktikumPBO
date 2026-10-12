package jobsheet04;

import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private String tanggal;
    private double totalHarga;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String idPesanan, String tanggal) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.totalHarga = 0.0;
        this.daftarMenu = new ArrayList<Menu>();
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
        hitungTotal();
    }

    public double hitungTotal() {
        totalHarga = 0;
        for (Menu menu : daftarMenu) {
            totalHarga += menu.getHarga();
        }
        return totalHarga;
    }

    public ArrayList<Menu> getMenuList() {
        return daftarMenu;
    }

    public double getTotalHarga() {
        return totalHarga;
    }
}
