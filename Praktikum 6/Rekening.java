package Praktikum6.Tugas;

public class Rekening {
    private String nomor;
    private String namaPemilik;
    private double saldo;

    public Rekening() {
    }

    public Rekening(String nomor, String pemilik, double saldo) {
        this.nomor = nomor;
        this.namaPemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getPemilik() {
        return namaPemilik;
    }

    public void setPemilik(String pemilik) {
        this.namaPemilik = pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
