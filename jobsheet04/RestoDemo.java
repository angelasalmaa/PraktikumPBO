package jobsheet04;

public class RestoDemo {
    public static void main(String[] args) {
        Menu menu1 = new Menu("M01", "Nasi Goreng", 25000);
        Menu menu2 = new Menu("M02", "Es Teh Manis", 5000);
        Menu menu3 = new Menu("M03", "Ayam Bakar", 30000);

        Pelanggan pelanggan1 = new Pelanggan("P01", "Budi Santoso");

        Pesanan pesanan1 = new Pesanan("ORD01", "2023-10-25");
        pesanan1.tambahMenu(menu1);
        pesanan1.tambahMenu(menu2);
        pelanggan1.tambahPesanan(pesanan1);

        Pesanan pesanan2 = new Pesanan("ORD02", "2023-10-26");
        pesanan2.tambahMenu(menu3);
        pesanan2.tambahMenu(menu2);
        pelanggan1.tambahPesanan(pesanan2);

        System.out.println(pelanggan1.getTransaksi());
    }
}