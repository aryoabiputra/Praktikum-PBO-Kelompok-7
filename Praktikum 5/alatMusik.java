//Kelas yang merpresentasikan sebuah alat musik
public class alatMusik {
    // Atribut (properti) dari objek AlatMusik
    String nama;
    String jenis;
    String tipe;

    // --- Konstruktor ---

    // Konstruktor dengan tiga parameter (overloaded)
    public alatMusik(String nama, String jenis, String tipe) {
        this.nama = nama;
        this.jenis = jenis;
        this.tipe = tipe;
    }

    // Konstruktor dengan dua parameter (overloaded)
    public alatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.tipe = "Tidak Diketahui"; // Memberikan nilai default untuk 'tipe'
    }

    // --- Metode ---

    // Metode untuk menampilkan informasi tentang alat musik
    public void displayInfo() {
        System.out.println("Nama Alat Musik: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Tipe: " + tipe);
    }

    // Metode untuk menghasilkan suara generik (overloaded)
    public void bunyi() {
        System.out.println("Alat musik " + nama + " sedang berbunyi.");
    }

    // Metode untuk menghasilkan suara spesifik (overloaded)
    public void bunyi(String suara) {
        System.out.println("Suara alat musik " + nama + " adalah: " + suara);
    }
}
