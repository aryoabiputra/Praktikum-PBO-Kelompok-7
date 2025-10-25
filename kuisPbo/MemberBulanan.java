package kuisPbo;

public class MemberBulanan extends Pelanggan implements IBisaDitagih{
    private double iuranBulanan;

    public MemberBulanan(String nama, String IdPelanggan, double iuranBulanan){
        super(nama, IdPelanggan);
        this.iuranBulanan = iuranBulanan;
    }

    @Override
    public void tampilkanStruk(){
        System.out.println("Nama            : " + getNama());
        System.out.println("ID Pelangggan   : " + getIdPelanggan());
        System.out.println("Tipe Member   : Member Bulanan ");
        System.out.println("Total Biaya   : " + iuranBulanan);

    }
}
