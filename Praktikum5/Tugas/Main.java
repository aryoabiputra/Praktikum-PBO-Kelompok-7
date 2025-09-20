package Praktikum5.Tugas;

public class Main {
    public static void main(String[] args) {

        // Membuat 3 Objek Berbeda dari Tim MPL ID 
        TeamMplId team1 = new TeamMplId("ONIC Esports", 2018, "Landak Kuning");
        TeamMplId team2 = new TeamMplId("RRQ Hoshi", 2013, "Badut Lokal");
        TeamMplId team3 = new TeamMplId("EVOS Legends", 2016, "Macan Putih");

        // Menampilkan informasi dari masing-masing objek
       team2.tampilkanInfo(true);
       team1.tampilkanInfo(true, 7);
       team3.tampilkanInfo(false, 2);
    }
}
