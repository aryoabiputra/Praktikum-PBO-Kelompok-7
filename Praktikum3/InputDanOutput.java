package Praktikum3;
import java.util.Scanner;

public class InputDanOutput {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        System.out.println("Baris kedua");

        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        String nama = "Andri";
        int umur = 19;
        double tinggi = 165.5;

        System.out.printf("Nama: %s, umur: %d, tinggi: %.1f cm%n", nama, umur, tinggi);

        Scanner scanner = new Scanner(System.in);

        // Input String
        System.out.print("Masukkan nama: ");
        String inputNama = scanner.nextLine();

        // Input Integer
        System.out.print("Masukkan umur: ");
        int inputUmur = scanner.nextInt();

        // Input Double
        System.out.print("Masukkan tinggi badan: ");
        double inputTinggi = scanner.nextDouble();
        scanner.close();

        System.out.printf("Halo %s, umur kamu %d tahun, dan tinggi kamu %.1f cm%n", inputNama, inputUmur, inputTinggi);
    }
}
