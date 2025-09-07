package Praktikum2;

public class Main {

    public static void main(String[] args) {
        // mendeklarasikan dan menginisialisasi variabel
        String nama = "Andriansyah";
        final long nim = 2407111615L;

        // menyimpan IP ke dalam sebuah array
        double[] ip = {3.57, 3.64};
        String alamat = "Jalan Cipta Karya";
        int umur = 19;
        char golonganDarah = 'O';

        // Konversi IP dari double ke byte
        byte ipByte = (byte) ip[0];
        byte ipByte2 = (byte) ip[1];

        // Mmenampilkan biodata
        System.out.println("------- BIODATA ANDRIANSYAH -------");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IP Semester 1 : " + ip[0]);
        System.out.println("IP Semester 2 : " + ip[1]);
        System.out.println("IP Semester 1 dalam bentuk byte : " + ipByte);
        System.out.println("IP Semester 2 dalam bentukbyte : " + ipByte2);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
        System.out.println("Golongan Darah : " + golonganDarah);
        
    }
}