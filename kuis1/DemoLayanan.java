package kuis1;

public class DemoLayanan {
    public static void main(String[] args) {
        LayananAkademik antrian1 = new LayananAkademik("A01", "Adista Febrianti", "254109080", "Pengajuan Cuti");
        LayananAkademik antrian2 = new LayananAkademik("A02", "Naf'an Fahrezi", "254107099", "Surat Keterangan Aktif");
        LayananAkademik antrian3 = new LayananAkademik("A03", "Ronaldo Aslam", "244107220", "Legalisir Ijazah");
        LayananAkademik antrian4 = new LayananAkademik("A04", "Renalda Aslam", "243109484", "Surat Keterangan Aktif");

        System.out.println("-- Alur Normal (A01) --");
        antrian1.melayani();
        antrian1.selesaikan();

        System.out.println("\n-- Alur Pembatalan (A02) --");
        antrian2.batalkan();

        System.out.println("\n-- Alur Tidak Normal (A03 & A04) --");
        antrian3.melayani();
        antrian3.selesaikan();
        antrian3.melayani();

        antrian4.batalkan();
        antrian4.melayani();

        System.out.println("\n-- Status Akhir Tiap Antrian --");
        antrian1.displayInfo();
        antrian2.displayInfo();
        antrian3.displayInfo();
        antrian4.displayInfo();
    }
}
