package Praktikum5.Tugas;

public class Main {
    public static void main(String[] args) {

        // Membuat 3 Objek Berbeda dari Film
        Film film1 = new Film("Parasite", 2019, "Thriller");
        Film film2 = new Film("Interstellar", 2014, "Sci-Fi");
        Film film3 = new Film("Laskar Pelangi", 2008, "Drama");

        // Menampilkan informasi dari masing-masing objek
        film2.tampilkanInfo(true, 8.7);
        film1.tampilkanInfo(true, 8.5);
        film3.tampilkanInfo(false, 7.7);
    }
}
