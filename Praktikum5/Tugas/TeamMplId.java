package Praktikum5.Tugas;

public class TeamMplId {

    // attributes
    String namaTeam;
    int tahunBerdiri;
    String julukan;

    // default constructor
    public TeamMplId() {
        this.namaTeam = "Unknown";
        this.tahunBerdiri = 0;
        this.julukan = "Unknown";
    }

    // constructor dengan nama team saja
    public TeamMplId(String namaTeam) {
        this.namaTeam = namaTeam;
        this.tahunBerdiri = 0;
        this.julukan = "Unknown";
    }

    // constructor dengan parameter lengkap
    public TeamMplId(String namaTeam, int tahunBerdiri, String julukan) {
        this.namaTeam = namaTeam;
        this.tahunBerdiri = tahunBerdiri;
        this.julukan = julukan;
    }

    // Method 1: Menampilkan informasi dasar tim
    public void tampilkanInfo() {
        System.out.println("Nama Tim            : " + namaTeam);
        System.out.println("Tahun Berdiri       : " + tahunBerdiri);
        System.out.println();
    }

    // Method 2: Menampilkan informasi lengkap tim termasuk julukan
    public void tampilkanInfo(boolean tampilkanJulukan) {
        System.out.println("Nama Tim            : " + namaTeam);
        System.out.println("Tahun Berdiri       : " + tahunBerdiri);
        System.out.println("Julukan             : " + julukan);
        System.out.println();
    }
    
    // Method 3 :  menampilkan informasi julukann dan jumlah juara mpl id
    public void tampilkanInfo(boolean tampilkanJulukan, int jumlahJuara) {
        System.out.println("Nama Tim            : " + namaTeam);
        System.out.println("Tahun Berdiri       : " + tahunBerdiri);
        System.out.println("Jumlah Juara MPL ID : " + jumlahJuara);
        System.out.println();
    }
}