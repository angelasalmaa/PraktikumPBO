package jobsheet04;

public class Menu {
    private String idMenu;
    private String namaMenu;
    private double harga;

    public Menu(String idMenu, String namaMenu, double harga) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getMenuInfo() {
        return namaMenu + " (ID: " + idMenu + ") - Rp" + harga;
    } 
}