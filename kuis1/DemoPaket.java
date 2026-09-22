package kuis1;

public class DemoPaket {
    public static void main(String[] args) {
        PaketInternet paketA = new PaketInternet("PAKET10GB", 10240, 50000);
        PaketInternet paketB = new PaketInternet("PAKET5GB", 5120, 30000);
        PaketInternet paketC = new PaketInternet("PAKET 2GB", 2048, 15000);

        System.out.println("-- Penggunaan Paket Nonaktif --");
        paketA.gunakanKuota(500); 

        System.out.println("\n-- Penggunaan Paket Normal --");
        paketA.aktifkanPaket();
        paketA.gunakanKuota(1024); 

        paketB.aktifkanPaket();
        paketB.gunakanKuota(2000); 

        System.out.println("\n-- Penggunaan Tidak Normal --");
        paketC.aktifkanPaket();
        paketC.gunakanKuota(3000); 
        paketC.gunakanKuota(-500); 

        System.out.println("\n-- Pengunaan Setelah Paket Nonaktif --");
        paketB.nonaktifkanPaket();
        paketB.gunakanKuota(100); 

        System.out.println("\n--- Status Akhir Paket ---");
        paketA.tampilkanStatus();
        paketB.tampilkanStatus();
        paketC.tampilkanStatus();
    }
}
