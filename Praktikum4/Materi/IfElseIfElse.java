package Praktikum4.Materi;

import java.util.Scanner;

public class IfElseIfElse {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        int nilai = input.nextInt();

        if(nilai > 75 ){
            System.out.println("Anda Lulus Ujian");
        }else if (nilai > 65) {
            System.out.println("Nilai anda berada diambang batas kelulusan");
        }else {
            System.out.println("Anda harus mengulang Ujian");
        }
    }
}
