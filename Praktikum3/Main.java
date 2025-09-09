import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //deklarasi scanner 

        // Deklarasi variabel serta memasukkan nilai yang di input oleh user ke dalamnya
        System.out.print("Masukkan panjang alas tinggi segitiga : ");
        double panjangAlasSegitiga = scanner.nextDouble(); //mengambil nilai panjang alas segitiga 

        System.out.print("Masukkan tinggi segitiga : "); 
        double tinggiSegitiga = scanner.nextDouble(); //mengambil nilai tinggi segitiga

        System.out.print("Masukkan tinggi prisma : ");
        double tinggiPrisma = scanner.nextDouble(); //mengambil nilai tinggi prisma

        System.out.print("Masukkan sisi A : ");
        double sisiA = scanner.nextDouble(); //mengambil nilai sisi A

        System.out.print("Masukkan sisi B : ");
        double sisiB = scanner.nextDouble(); //mengambil nilai sisi B

        System.out.print("Masukkan sisi C : ");
        double sisiC = scanner.nextDouble(); //mengambil nilai sisi C
        scanner.close();

        // Operasi perhitungan berdasarkan rumus rumus yang ada di Prisma Segitiga
        System.out.println("------------------ Hasil Perhitungan ------------------");

        // Luas alas
        double luasAlas = panjangAlasSegitiga * tinggiSegitiga / 2; //perhitungan luas alas
        System.out.println("luas alas                      : " + luasAlas);

        // volume prisma segitiga
        double volume = luasAlas * tinggiPrisma; //rumus volume
        System.out.println("volume prisma segitiga         : " + volume);

        // Keliling alas segitiga
        double keliling = sisiA + sisiB + sisiC; //rumus Keliling
        System.out.println("Keliling alas segitiga         : " + keliling);

        // Luas permukaan prisma segitiga
        double luasPermukaan = 2 * luasAlas + keliling * tinggiPrisma; //rumus luas permukaan prisma segitiga
        System.out.println("Luas permukaan prisma segitiga : " + luasPermukaan);

        // Luas sisi tegak
        double luasSisiTegak = (sisiA * tinggiPrisma) + (sisiB * tinggiPrisma) + (sisiC * tinggiPrisma); //rumus luas sisi tegak
        System.out.println("Luas sisi tegak                : " + luasSisiTegak);

    }

}
