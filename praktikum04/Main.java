package com.praktikum4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //prpgram untuk membuat kalkulator menghitung luas bangun datar
        Scanner input = new Scanner(System.in);
        System.out.println("Klik ENTER untuk masuk ke dalam progarm");
        input.nextLine();

        while(true)
        {
            System.out.println("===Selamat datang di program kalkulator menghitung luas bangun datar====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.println("Silahkan pilih menu 1-5 diatas :");
            int pilih = input.nextInt();

            switch(pilih)
            {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Menghitung Luas Bangun Datar Persegi");
                    System.out.println("Rumus untuk menghitung bangun datar persegi yaitu = sisi X sisi");
                    System.out.println("Klik Enter untuk mulai menghitung");
                    input1.nextLine();
                    System.out.println("Masukkan panjang sisi dalam centi meter");
                    System.out.print("Panjang Sisi = ");
                    int panjangSisi = input1.nextInt();
                    int luasPersegi = panjangSisi * panjangSisi;
                    System.out.println("Luas persegi dengan Panjang sisi " + panjangSisi + "cm = " + luasPersegi + "cm kuadrat");
                    System.out.println();
                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Menghitung luas bangun datar persegi panjang");
                    System.out.println("Rumus untuk menghitung luas bangun datar persegi panjang yaitu = Panjnag X Lebar");
                    System.out.println("Klik Enter untuk mulai menghitung");
                    input2.nextLine();
                    System.out.println("Silahkan masukkan lebar dan panjang persegi dalam bnetuk centi meter");
                    System.out.print("Panjang Sisi =");
                    int panjangPersegi = input2.nextInt();
                    System.out.print("Lebar Sisi =");
                    int lebarPersegi = input2.nextInt();
                    int luasPersgipanjang = panjangPersegi * lebarPersegi;
                    System.out.println("Luas persegi panjang dengan panjang " + panjangPersegi + "cm dan Lebar " + lebarPersegi + "cm = " +luasPersgipanjang + "cm");
                    System.out.println();
                    break;
                case 3:
                    while(true)
                    {
                        Scanner input3 = new Scanner(System.in);
                        System.out.println("Menghitung luas bangun datar Lingkaran");
                        System.out.println("Rumus untuk menghitung bangun datar Lingkaran yaitu = phi X r X r");
                        System.out.println("Klik N untuk mulai menghitung dan klik K untuk melihat keterangan rumus");
                        char mulai = input3.next().charAt(0);
                        if (mulai == 'N') {
                            System.out.println("Silahkan masukkan panjang jari-jari lingkaran dalam bentuk cm");
                            System.out.print("Panjang r =");
                            double jariJari = input3.nextDouble();
                            double luasLingkaran = 3.14 * jariJari * jariJari;
                            System.out.println("Luas lingkarang dengan panjang jari-jari " + jariJari + "cm = " + luasLingkaran);
                            System.out.println();
                            break;
                        } else if (mulai == 'K') {
                            System.out.println("Keterangan Rumus : Phi X r X r");
                            System.out.println("phi = 22/7");
                            System.out.println("r = Jari-Jari lingkaran");
                            System.out.println();
                        } else {
                            System.out.println("Pilihan anda tidak valid silahkan masukkan pilihan N/k");
                            System.out.println();
                        }
                    }break;
                case 4:
                    while(true)
                    {
                        Scanner input4 = new Scanner(System.in);
                        System.out.println("Menghitung luas bangun datar Segitiga");
                        System.out.println("Rumus untuk menghitung luas bangun datar segitiga = 1/2 X a X t");
                        System.out.println("Klik N untuk mulau menghitung dan klin K untuk melihat Keterangan Rumus");
                        char mulai = input4.next().charAt(0);
                        if (mulai == 'N') {
                            System.out.println("Silahkan masukkan panjaang alas dan tinggi segitiga dalam bentuk centi meter");
                            System.out.print("Panjang alas = ");
                            double panjangAlas = input4.nextDouble();
                            System.out.print("Tinggi segitiga = ");
                            double tinggiSegitiga = input4.nextDouble();

                            double luasSegitiga = 0.5 * panjangAlas * tinggiSegitiga;
                            System.out.println("Luas segitiga dengan tinggi " + tinggiSegitiga + "cm dan panjang alas " + panjangAlas + "cm adalah = " + luasSegitiga);
                            System.out.println();
                            break;
                        } else if (mulai == 'K') {
                            System.out.println("Keterangan Rumus : 1/2 X a X t");
                            System.out.println("a = Alas Segitiga");
                            System.out.println("t = Tinggi segitiga");
                            System.out.println();
                        } else {
                            System.out.println("Pilihan Anda tidak valid silahkan masukkan pilihan N/K");
                        }
                    }break;
                case 5:
                    System.out.println("Terimakasih sudah menggunakan program saya :)");
                    return;
            }
        }

    }
}