package Materi;

public class Produk {
    protected String nama;
    protected int harga;

    public Produk(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilkanInfo(){
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga      : " + harga);
    }
}

