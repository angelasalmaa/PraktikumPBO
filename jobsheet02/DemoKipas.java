    package jobsheet02;

    public class DemoKipas {
        public static void main(String[] args) {
            KipasAngin k1 = new KipasAngin();
            k1.merk = "Maspion";
            k1.nyalakan();
            k1.ubahKecepatan(3);

            KipasAngin k2 = new KipasAngin();
            k2.merk = "Cosmos";
            k2.matikan();
            k2.ubahKecepatan(0);

            System.out.println("== Kipas Angin 1 ==");
            k1.displayInfo();
            System.out.println("\n== Kipas Angin 2 ==");
            k2.displayInfo();
        }
    }
