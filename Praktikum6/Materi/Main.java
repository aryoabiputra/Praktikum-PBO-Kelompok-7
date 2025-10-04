package Praktikum6.Materi;

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk ("Laptop", 15000000, 5);
        Produk p2 = new Produk ("Smartphone", 3500000, 10);

        // System.out.println(p1.nama);
        // System.out.println(p1.stok);
        // System.out.println(p1.harga);

        p1.tampilkanInfo();

        // p1.namaSupplier(); // error karena private
        p1.namaSupplierFix();
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();

        System.out.println("Nama produk 1 : " + p1.nama);
        // System.out.println(p1.harga); // error karena private

        System.out.println("Harga  Produk 1 " +  p1.getHarga());

        p1.setHarga(7000000);
        System.out.println("Harga baru untuk produk 1 : " + p1.getHarga());

        Produk.infoJumlahProduk();
        System.out.println();
    }
}
