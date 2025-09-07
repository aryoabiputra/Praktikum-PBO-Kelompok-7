package Praktikum3.Tugas;
import java.util.Scanner;

public class KalkulatorPrismaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta nilai input prisma segitiga
        System.out.println("==== KALKULATOR PRISMA SEGITIGA ====");
        System.out.print("Masukkan panjang alas segitiga (a): ");
        double panjangAlas = input.nextDouble();

        System.out.print("Masukkan sisi kedua segitiga (b): ");
        double sisiKedua = input.nextDouble();

        System.out.print("Masukkan sisi ketiga segitiga (c): ");
        double sisiKetiga = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga alas: ");
        double tinggiAlas = input.nextDouble();

        System.out.print("Masukkan tinggi prisma (T): ");
        double tinggiPrisma = input.nextDouble();
        System.out.println();

        // menghitung luas alas segitiga
        double luasAlas = 0.5 * panjangAlas * tinggiAlas;

        // menghitung volume prisma segitiga
        double volume = luasAlas * tinggiPrisma;

        // menghitung luas permukaan prisma segitiga
        double kelilingAlas = panjangAlas + sisiKedua + sisiKetiga;
        double luasPermukaan = (2 * luasAlas) + (kelilingAlas * tinggiPrisma);

        // Menampilkan hasil
        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("Luas Alas Segitiga     = " + luasAlas);
        System.out.println("Volume Prisma          = " + volume);
        System.out.println("Luas Permukaan Prisma  = " + luasPermukaan);

    }
}
