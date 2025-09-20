abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    // Method abstract (Wajib diimplementasikan oleh subclass)
    abstract void suara();

    // Method biasa
    void info() {
        System.out.println("Nama hewan: " + nama);
    }
}
