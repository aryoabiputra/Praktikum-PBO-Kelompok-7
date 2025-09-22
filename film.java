public class Film {

// attributes
String namaFilm;
int tahunRilis;
String genre;

//default constructor
public Film() {
this.namaFilm = "Unknown";
this.tahunRilis = 0;
this.genre = "Unknown";

}

// contructor dengan nama film saja
public Film(String namaFilm) {
this.namaFilm = namaFilm;
this.tahunRilis = 0;
this.genre = "Unknown";
}

// constructor dengan parameter lengkap
public Film(String namaFilm, int tahunRilis, String genre) {
this.namaFilm = namaFilm;
this.tahunRilis = tahunRilis;
this.genre = genre;
}

// Method 1: Menampilkan informasi dasar film
    public void tampilkanInfo() {
        System.out.println("Nama Film            : " + namaFilm);
        System.out.println("Tahun Rilis       : " + tahunRilis);
        System.out.println();
    }

    // Method 2: Menampilkan informasi lengkap tim termasuk julukan
    public void tampilkanInfo(boolean tampilkanGenre) {
        System.out.println("Nama Film            : " + namaFilm);
        System.out.println("Tahun Rilis       : " + tahunRilis);
        System.out.println("Genre             : " + genre);
        System.out.println();
    }
    
    // Method 3 :  menampilkan informasi genre dan rating
    public void tampilkanInfo(boolean tampilkanGenre, double rating) {
        System.out.println("Nama Film           : " + namaFilm);
        System.out.println("Tahun Rilis         : " + tahunRilis);
        System.out.println("Genre                : " + genre);
        System.out.println("Rating              : " + rating);
        System.out.println();
    }
}
