package jobsheet07;

public class Kendaraan {
    public String merk;
    public String warna;
    public int tahun;

    public Kendaraan() {
        System.out.println("Object dari class Kendaraan dibuat");
    }

    public Kendaraan(String merk, int tahun, String warna) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
    }

    public String getInfo() {
        String info = "";
        info += "Merk   : " + merk + "\n";
        info += "Tahun  : " + tahun + "\n";
        info += "Warna  : " + warna + "\n";
        return info;
    }
}
