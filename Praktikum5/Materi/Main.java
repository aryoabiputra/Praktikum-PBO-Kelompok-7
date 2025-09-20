public class Main {
    public static void main(String[] args) {
        // Constructor Overloading
        Mobil2 mobilA = new Mobil2();
        Mobil2 mobilB = new Mobil2("Toyota");

        // Method overloading 
        Kalkulator calc =  new Kalkulator();
        System.out.println(calc.tambah1(5, 3));
        System.out.println(calc.tambah1(5.5, 3.3));
        System.out.println(calc.tambah1("Hello, ", "World!"));
    }
}
