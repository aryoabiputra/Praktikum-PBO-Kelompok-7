public class Mobil2 {
    // Atribut
    private String merek;
    private String warna;
    private int tahun;
    private double harga;

    // consturctor 1 : default
    public Mobil2(){
        this.merek = "Unknown";
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }

    // consatructor 2 : dengan merek saja
    public Mobil2 (String merek){
        this.merek = merek;
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;   
    }
}
