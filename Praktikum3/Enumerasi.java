package Praktikum3;
public class Enumerasi {
    public static void main(String[] args) {
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }

        Hari hariIni = Hari.SENIN;

        if (hariIni == Hari.SENIN) {
            System.out.println("Hari ini adalah hari Senin.");
            System.out.println("Besok adalah " + Hari.SELASA);
        }
    }
}
