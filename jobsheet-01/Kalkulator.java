import java.util.Scanner;

public class Kalkulator {
    
    // Function penjumlahan
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    // Function pengurangan
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    // Function perkalian
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    // Function pembagian
    public static double bagi(double angka1, double angka2) {
        return angka1 / angka2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.print("Masukkan angka 1 : ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan opreator (+, -, *, /) : ");
        operator = sc.next().charAt(0);
        System.out.print("Masukkan angka 2 : ");
        angka2 = sc.nextDouble();

        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                System.out.println("Hasil = " + hasil);
                break;
            case '-' :
                hasil = kurang(angka1, angka2);
                System.out.println("Hasil = " + hasil);
                break;
            case '*' :
                hasil = kali(angka1, angka2);
                System.out.println("Hasil = " + hasil);
                break;
            case '/' :
                hasil = bagi(angka1, angka2);
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}
