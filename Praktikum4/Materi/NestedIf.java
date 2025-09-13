package Praktikum4.Materi;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int angka = input.nextInt();
        if(angka >= 0 ){
            System.out.println("Bilangan bernilai Positif");

            if (angka % 2 == 0) {
                System.out.println("dan Genap");
            }else {
                System.out.println("dan Ganjil");
            }
        }else if (angka == 0) {
            System.out.println("Bilangan bernilai Netral");
        }else {
            System.out.println("Bilangan bernilai Negatif");
            
            if (angka % 2 == 0) {
                System.out.println("dan Genap");
            }else {
                System.out.println("dan Ganjil");
            }
        }
    }
}
