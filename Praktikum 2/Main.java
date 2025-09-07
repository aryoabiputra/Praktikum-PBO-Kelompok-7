package com.praktikum2;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Program Untuk Menginput Biodata mahasiswa");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM Anda : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Alamat anda : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Indeks Prestasi Semester 1 : ");
        double semester1 = input.nextDouble();
        System.out.println("Indeks Prestasi Semester 1 dalam Bentuk byte : " + (byte) semester1);
        byte ipByte1 = (byte) semester1;

        System.out.print("Masukkan Indeks Semester 2 : ");
        double semester2 = input.nextDouble();
        System.out.println("Indeks Prestasi Semester 2 dalam Bentuk byte : " + (byte) semester2);
        byte ipByte2 = (byte) semester2;

        System.out.print("Masukkan Usia Anda : ");
        int usia = input.nextInt();

        System.out.print("Masukkan Golongan Darah : ");
        char golonganDarah = input.next().charAt(0);
        double ipk = (semester1 + semester2) / 2;

        System.out.println("Tekan ENTER untuk mencetak hasil input Biodata");
        input.nextLine();
        input.nextLine();

        System.out.println("-----------------------------------------");
        System.out.println(" ***Biodata " + nama + "*** ");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM Mahasiswa : " + nim);
        System.out.println("Alamat Rumah : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Indeks Prestasi Semester 1 : " + semester1);
        System.out.println("Indeks Prestasi Semester 2 : " + semester2);
        System.out.println("Indeks Prestasi Semester 1 dalam byte : " + ipByte1);
        System.out.println("Indeks Prestasi Semseter 2 dalam byte : " + ipByte2);
        System.out.println("Indeks Prestasi Kumulatif Saat Ini : " + ipk );
    }
}
