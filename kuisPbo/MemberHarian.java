package kuisPbo;

public class MemberHarian extends Pelanggan implements IBisaDitagih{
    private double tarifHarian;
    private int jumlahKunjungan;
    private double totalBiaya = tarifHarian * jumlahKunjungan;


    public MemberHarian(String nama, String IdPelanggan, double tarifHarian, int jumlahKunjungan){
        super(nama, IdPelanggan);
        this.tarifHarian = tarifHarian;
        this.jumlahKunjungan = jumlahKunjungan;
    }

    @Override
    public void tampilkanStruk(){
        System.out.println("Nama            : " + getNama());
        System.out.println("ID Pelangggan   : " + getIdPelanggan());
        System.out.println("Tipe Member   : Member Harian ");
        System.out.println("Total Biaya   : " + totalBiaya);
    }

}
