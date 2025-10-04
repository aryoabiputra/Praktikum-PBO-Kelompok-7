public class Main {
    public static void main(String[] args) {
        // set bank info (static)
        Bank.setNamaBank("BRI");
        Bank.setAlamat("Jl. Bangau Sakti");
        Bank.setKodeBank(123);

        // create rekening instances
        Rekening rk1 = new Rekening("123-456", "Aryo", 150000.0);
        Rekening rk2 = new Rekening();
        rk2.setNomor("654-321");
        rk2.setPemilik("Putra");
        rk2.setSaldo(100000.0);

        // print bank info
        Bank.printInfo();

        // print rekening details
        System.out.println();
        System.out.println("--- Daftar Rekening ---");
        tampilInfo(rk1);
        tampilInfo(rk2);
    }

    private static void tampilInfo(Rekening r) {
        System.out.println("Nomor    : " + r.getNomor());
        System.out.println("Pemilik  : " + r.getPemilik());
        System.out.println("Saldo    : Rp " + String.format("%,.2f", r.getSaldo()).replace(',', '.'));
        System.out.println();
    }
}
