package uts;

public class KartuKantin {
    private String idKartu;
    private int saldo;
    private int jmlTransaksi;

    public KartuKantin(String idKartu) {
        this.idKartu = idKartu;
        this.saldo = 0;
        this.jmlTransaksi = 0;
    }

    public void cetakStatus() {
        System.out.println("Kartu " + idKartu + " -> Saldo: Rp" + saldo 
                            + " | Transaksi: " + jmlTransaksi 
                            + " | Kategori: " + getKategoriSaldo()
        );
    }

    public String getKategoriSaldo() {
        if (saldo < 25000) {
            return  "RENDAH";
        } else if (saldo >= 25000 && saldo < 100000) {
            return "SEDANG";
        } else {
            return "TINGGI";
        }
    }

    public void isiSaldo(int nominal) {
        System.out.println("Isi saldo Rp" + nominal + " ke kartu " + idKartu);
        if (nominal <= 0) {
            System.out.println("GAGAL! Nominal pengisian harus bernilai positif.");
            return;
        }
        saldo += nominal;
        System.out.println("BERHASIL! Saldo ditamnbahkan.");
    }

    public void bayar(int nominal) {
        System.out.println("Pembayaran Rp" + nominal + " dengan kartu " + idKartu);
        if (nominal <= 0) {
            System.out.println("GAGAL! Nominal pembayaran harus bernilai positif.");
            return;
        } 

        if (saldo < nominal) {
            System.out.println("GAGAL! Saldo tidak cukup. Pembayaran gagal.");
            return;
        }
        saldo -= nominal;
        jmlTransaksi++;
        System.out.println("BERHASIL! Pembayaran diterima.");
    }
}
