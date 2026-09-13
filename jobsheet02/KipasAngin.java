    package jobsheet02;

    public class KipasAngin {
        public String merk;
        public int kecepatan;
        public boolean status;

        public void nyalakan() {
            status = true;
        }

        public void matikan() {
            status = false;
        }

        public void ubahKecepatan(int speed) {
            kecepatan = speed;
        }

        public void displayInfo() {
            System.out.println("Merk        : " + merk);
            System.out.println("Status      : " + 
                                (status ? "Menyala" : "Mati"));
            System.out.println("Kecepatan   : " + kecepatan);
        }
    }
