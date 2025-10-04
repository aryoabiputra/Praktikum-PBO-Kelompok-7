public class Kalkulator {
    // Method dengan 2 parameter
    public int tambah (int a, int b){
        return a + b;
    }

    // Method dengan 3 parameter
    public int tambah (int a, int b, int c){
        return a + b + c;
    }

    // Method dengan 4 parameter
    public int tambah (int a, int b, int c, int d){
        return a + b + c + d;
    }

    // Method untuk integer
    public int tambah1 (int a, int b){
        System.out.println("Menambah integer");
        return a + b;
    }

    // Method untuk double
    public double tambah1(double a, double b){
        System.out.println("Menambah double");
        return a + b;
    }

    // Method untuk string (concatenation)
    public String tambah1(String a, String b){
        System.out.println("Menggabungkan string");
        return a + b;
    }
}
