package jobsheet02;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "025432";
        m2.nama = "Angela Salma";
        m2.alamat = "Pare, Kediri";
        m2.kelas = "2C";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "025943";
        m3.nama = "Naf'an Fahrezi";
        m3.alamat = "Ngadiluwih, Kediri";
        m3.kelas ="2D";

        m2.displayBiodata();
        m3.displayBiodata();
    }
}
