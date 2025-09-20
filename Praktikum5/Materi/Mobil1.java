public class Mobil1 {
    private String merek;
    private String warna;
    private int tahun;

    // default constructor
    public Mobil1() {
        this.merek = "Unknown";
        this.warna = "Unknown";
    }

    // Constructor dengan parameter
    public Mobil1(String merek, String warna, int tahun) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
    }
}
