package jobsheet07;

public class Mobil extends Kendaraan {
    public int jumlahPintu;

    public Mobil(String merk, int tahun, String warna, int jumlahPintu) {
        super(merk, tahun, warna);
        this.jumlahPintu = jumlahPintu;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Pintu  : " + jumlahPintu + "\n";
        return info;
    }
}
