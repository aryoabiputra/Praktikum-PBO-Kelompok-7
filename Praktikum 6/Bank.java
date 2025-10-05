package Praktikum6.Tugas;

public class Bank {
    // Deklarasi atibut privat bersifat static
    private static String namaBank;
    private static String alamat;
    private static int kodeBank;

    // Membuat fungsi geter dan setter 
    public static String getNamaBank() {
        return namaBank;
    }

    public static void setNamaBank(String namaBank) {
        Bank.namaBank = namaBank;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Bank.alamat = alamat;
    }

    public static int getKodeBank() {
        return kodeBank;
    }

    public static void setKodeBank(int kodeBank) {
        Bank.kodeBank = kodeBank;
    }

    // membuat fungsi printInfo
    public static void printInfo() {
        System.out.println("=== Informasi Bank ===");
        System.out.println("Nama Bank : " + namaBank);
        System.out.println("Alamat    : " + alamat);
        System.out.println("Kode Bank : " + kodeBank);
    }
} 
    

