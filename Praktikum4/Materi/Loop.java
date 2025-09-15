package Praktikum4.Materi;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // For Loop
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        String[] mahasiswa = {"Andi", "Budi", "Citra", "Dewi", "Eko"};
        for (int j = 0; j < mahasiswa.length; j++) {
            System.out.println("Mahasiswa ke-" + (j + 1) + ": " + mahasiswa[j]);
        }

        // While Loop
        int a = 1;
        while (a <= 5) {
            System.out.println("While Loop ke-" + a);
            a++;
        }

        Scanner input = new Scanner(System.in);
        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Masukkan password: ");
            password = input.nextLine();
        }
        System.out.println("Login berhasil!");

        // Do-While Loop
        int x = 6;
        do {
            System.out.println("Do-While Loop ke-" + x);
            x++;
        } while (x <= 5);
    }
}
