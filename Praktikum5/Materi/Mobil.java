public class Mobil {
    // Atribut
    private String merek;
    private String warna;
    private int tahun;

    // Method
    public void nyalakanMesin(){
        System.out.println("Mesin dinyalakan");
    }

    public void matikanMesin(){
        System.out.println("Mesin dimatikan");
    }

    Mobil mobil1 = new Mobil();
    Mobil mobil2 = new Mobil();
}
