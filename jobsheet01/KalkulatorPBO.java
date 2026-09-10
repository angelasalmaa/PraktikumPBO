import java.util.Scanner;

public class KalkulatorPBO {
    private double angka1;
    private double angka2;

    public KalkulatorPBO(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        return angka1 / angka2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.print("Masukkan angka 1 : ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan opreator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);
        System.out.print("Masukkan angka 2 : ");
        double angka2 = sc.nextDouble();

        KalkulatorPBO kalkulator = new KalkulatorPBO(angka1, angka2);

        switch (operator) {
            case '+':
                System.out.println("Hasil = " + kalkulator.tambah());
                break;
            case '-' :
                System.out.println("Hasil = " + kalkulator.kurang());
                break;
            case '*' :
                System.out.println("Hasil = " + kalkulator.kali());
                break;
            case '/' :
                if (angka2 == 0) {
                    System.out.println("Tidak dapat membagi dengan nol");
                } else {
                    System.out.println("Hasil = " + kalkulator.bagi());
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}