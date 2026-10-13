package uts;

public class ParkirDemo {
    public static void main(String[] args) {
        Kendaraan k1 = new Kendaraan("AG 1607 HJ");
        Kendaraan k2 = new Kendaraan("B 8593 EFG");
        Kendaraan k3 = new Kendaraan("N 3421 AJ");

        System.out.println("\nPengujian masuk dan keluar valid (durasi tepat 2 jam)");
        k1.masuk(7);
        k1.keluar(9);

        System.out.println("\nPengujian masuk dan keluar valid (durasi lebih dari 2 jam)");
        k2.masuk(10);
        k2.keluar(15);

        System.out.println("\nPengujian kendaraan yang masih parkir mencoba masuk lagi");
        k3.masuk(12);
        k3.masuk(13);

        System.out.println("\nPengujian waktu keluar lebih dari waktu masuk");
        k3.keluar(10);
        k3.keluar(15);

        System.out.println("\nPengujian kendaraan yang belum masuk mecoba keluar");
        k1.keluar(12);
    }
}
