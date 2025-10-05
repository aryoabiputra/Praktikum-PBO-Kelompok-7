public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas AlatMusik dengan 3 parameter
        alatMusik gitar = new alatMusik("Gitar", "Senar", "Akustik");

        // Menggunakan metode dari objek 'gitar'
        gitar.displayInfo();
        gitar.bunyi();

        System.out.println("-------------------------");

        // Membuat objek lain dengan hanya 2 parameter, mendemonstrasikan overloading konstruktor
        alatMusik drum = new alatMusik("Drum", "Perkusi");

        // Mendemonstrasikan overloading pada metode 'bunyi'
        drum.displayInfo();
        drum.bunyi(); // Memanggil metode 'bunyi()' tanpa parameter
        drum.bunyi("Dum dum tak!"); // Memanggil metode 'bunyi(String suara)' dengan parameter
    }
}













