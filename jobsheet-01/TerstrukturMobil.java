public class TerstrukturMobil {
    
    // Function unutuk menambah kecepatan
    public static int tambahKecepatan(int kecepatan, int tambahan) {
        kecepatan += tambahan;
        return kecepatan;
    }

    // Function untuk mengurangi kecepatan mobil
    public static int kurangiKecepatan(int kecepatan, int pengurangan) {
        kecepatan -= pengurangan;
        
        if (kecepatan < 0) {
            kecepatan = 0;
        }

        return kecepatan;
    }

    public static void main(String[] args) {
        String merk = "Toyota";
        String warna = "Putih";
        int kecepatan = 40;

        String merk1 = "Honda";
        String warna1 = "Hitam";
        int kecepatan1 = 50;

        String merk2 = "Hyundai";
        String warna2 = "Abu-abu";
        int kecepatan2 = 45;

        String merk3 = "Lamborghini";
        String warna3 = "Kuning";
        int kecepatan3 = 55;

        String merk4 = "Daihatsu";
        String warna4 = "Merah";
        int kecepatan4 = 60;

        String merk5 = "Suzuki";
        String warna5 = "Silver";
        int kecepatan5 = 35;

        String merk6 = "Mercedes";
        String warna6 = "Biru";
        int kecepatan6 = 65;

        String merk7 = "Jeep";
        String warna7 = "Hijau";
        int kecepatan7 = 70;

        String merk8 = "KIA";
        String warna8 = "Putih";
        int kecepatan8 = 45;

        String merk9 = "BMW";
        String warna9 = "Hitam";
        int kecepatan9 = 50;

        System.out.println("===== DATA MOBIL =====");

        System.out.println("\nMobil 1");
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Kecepatan awal : " + kecepatan);
        kecepatan = tambahKecepatan(kecepatan, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan);
        kecepatan = kurangiKecepatan(kecepatan, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan);

        System.out.println("\nMobil 2");
        System.out.println("Merk      : " + merk1);
        System.out.println("Warna     : " + warna1);
        System.out.println("Kecepatan awal : " + kecepatan1);
        kecepatan1 = tambahKecepatan(kecepatan1, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan1);
        kecepatan1 = kurangiKecepatan(kecepatan1, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan1);

        System.out.println("\nMobil 3");
        System.out.println("Merk      : " + merk2);
        System.out.println("Warna     : " + warna2);
        System.out.println("Kecepatan awal : " + kecepatan2);
        kecepatan2 = tambahKecepatan(kecepatan2, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan2);
        kecepatan2 = kurangiKecepatan(kecepatan2, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan2);

        System.out.println("\nMobil 4");
        System.out.println("Merk      : " + merk3);
        System.out.println("Warna     : " + warna3);
        System.out.println("Kecepatan awal : " + kecepatan3);
        kecepatan3 = tambahKecepatan(kecepatan3, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan3);
        kecepatan3 = kurangiKecepatan(kecepatan3, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan3);
        
        System.out.println("\nMobil 5");
        System.out.println("Merk      : " + merk4);
        System.out.println("Warna     : " + warna4);
        System.out.println("Kecepatan awal : " + kecepatan4);
        kecepatan = tambahKecepatan(kecepatan4, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan4);
        kecepatan = kurangiKecepatan(kecepatan4, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan4);

        System.out.println("\nMobil 6");
        System.out.println("Merk      : " + merk5);
        System.out.println("Warna     : " + warna5);
        System.out.println("Kecepatan awal : " + kecepatan5);
        kecepatan5 = tambahKecepatan(kecepatan5, 50);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan5);
        kecepatan5 = kurangiKecepatan(kecepatan5, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan5);

        System.out.println("\nMobil 7");
        System.out.println("Merk      : " + merk6);
        System.out.println("Warna     : " + warna6);
        System.out.println("Kecepatan awal : " + kecepatan6);
        kecepatan6 = tambahKecepatan(kecepatan6, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan6);
        kecepatan6 = kurangiKecepatan(kecepatan6, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan6);

        System.out.println("\nMobil 8");
        System.out.println("Merk      : " + merk7);
        System.out.println("Warna     : " + warna7);
        System.out.println("Kecepatan awal : " + kecepatan7);
        kecepatan7 = tambahKecepatan(kecepatan7, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan7);
        kecepatan7 = kurangiKecepatan(kecepatan7, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan7);

        System.out.println("\nMobil 9");
        System.out.println("Merk      : " + merk8);
        System.out.println("Warna     : " + warna8);
        System.out.println("Kecepatan awal : " + kecepatan8);
        kecepatan8 = tambahKecepatan(kecepatan8, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan8);
        kecepatan8 = kurangiKecepatan(kecepatan8, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan8);

        System.out.println("\nMobil 10");
        System.out.println("Merk      : " + merk9);
        System.out.println("Warna     : " + warna9);
        System.out.println("Kecepatan awal : " + kecepatan9);
        kecepatan9 = tambahKecepatan(kecepatan9, 10);
        System.out.println("Kecepatan setelah ditambah  : " + kecepatan9);
        kecepatan9 = kurangiKecepatan(kecepatan9, 20);
        System.out.println("Kecepatan setelah dikurangi : " + kecepatan9);
    }
}
