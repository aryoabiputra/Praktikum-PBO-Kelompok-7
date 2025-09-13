package Praktikum4.Tugas;
import java.util.Scanner;

public class KalkulatorLuasBangunDatar  {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Kelompok 7
        // deklarasi variabel pilihan yang akan digunakan untuk memilih menu
        int pilihan = 0;
        // Menggunakan do-while agar menu muncul terus sampai user memilih keluar
        do {
            System.out.println();
            System.out.println("=== KALKULATOR LUAS BANGUN DATAR ===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> hitungPersegi();
                case 2 -> hitungPersegiPanjang();
                case 3 -> hitungLingkaran();
                case 4 -> hitungSegitiga();
                case 5 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }

    // Method untuk mengitung Luas Persegi
    static void hitungPersegi() {
        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();
        double luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);
    }

    // Method untuk menghitung Luas Persegi Panjang
    static void hitungPersegiPanjang() {
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    // Method untuk menghitung Luas Lingkaran
    static void hitungLingkaran() {
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran = " + luas);
    }

    // Method untuk menghitung Luas Segitiga
    static void hitungSegitiga() {
        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + luas);
    }
}
