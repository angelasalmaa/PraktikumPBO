public class PBOMobil {
    String merk, warna;
    int kecepatan;

    public PBOMobil(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public int tambahKecepatan(int tambahan) {
        System.out.println("Kecepatan awal : " + kecepatan);
        kecepatan += tambahan;
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan);
        return kecepatan;
    }

    public int kurangiKecepatan(int pengurangan) {
        System.out.println("Kecepatan awal : " + kecepatan);
        kecepatan -= pengurangan;

        if (kecepatan < 0) {
            kecepatan = 0;
        }

        System.out.println("Kecepatan setelah dikurangi  : " + kecepatan);
        return kecepatan;
    }

    public void tampilData() {
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Kecepatan awal : " + kecepatan);
        // kecepatan = tambahKecepatan(10);
        // System.out.println("Kecepatan setelah ditambah  : " + kecepatan);
        // kecepatan = kurangiKecepatan(20);
        // System.out.println("Kecepatan setelah dikurangi : " + kecepatan);
    }

    public static void main(String[] args) {
        PBOMobil mobil1 = new PBOMobil("Toyota", "Putih", 40);
        PBOMobil mobil2 = new PBOMobil("Honda", "Hitam", 45);
        PBOMobil mobil3 = new PBOMobil("Daihatsu", "Biru", 50);
        PBOMobil mobil4 = new PBOMobil("Suzuki", "Abu-abu", 55);
        PBOMobil mobil5 = new PBOMobil("KIA", "Silver", 60);
        PBOMobil mobil6 = new PBOMobil("BMW", "Merah", 65);
        PBOMobil mobil7 = new PBOMobil("Hyundai", "Kuning", 70);
        PBOMobil mobil8 = new PBOMobil("Nissan", "Hitam", 75);
        PBOMobil mobil9 = new PBOMobil("Isuzu", "Kuning", 35);
        PBOMobil mobil10 = new PBOMobil("Chevrolet", "Putih", 30);
    }
}
