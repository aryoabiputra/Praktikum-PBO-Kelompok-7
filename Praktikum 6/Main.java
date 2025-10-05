package Praktikum6.Tugas;

public class Main {
    public static void main(String[] args) {
        // static atribut bank
        Bank.setNamaBank("BRI");
        Bank.setAlamat("Jl. Cipta Karya");
        Bank.setKodeBank(123);

        // membuat objek rekening
        Rekening rekening1 = new Rekening("123-456", "Andri", 200000.0);
        Rekening rekening2 = new Rekening();
        rekening2.setNomor("234-313");
        rekening2.setPemilik("Budi");
        rekening2.setSaldo(100000.0);

        // menampilkan info bank
        Bank.printInfo();

        // menampilkan detail rekening
        System.out.println();
        System.out.println("--- Daftar Rekening ---");
        tampilInfo(rekening1);
        tampilInfo(rekening2);
    }

    private static void tampilInfo(Rekening rek) {
        System.out.println("Nomor    : " + rek.getNomor());
        System.out.println("Pemilik  : " + rek.getPemilik());
        System.out.println("Saldo    : Rp " + rek.getSaldo());
        System.out.println();
    }
} 
    

