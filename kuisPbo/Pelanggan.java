package kuisPbo;

public class Pelanggan {
    private String nama;
    private String IdPelanggan;
     
    public String getNama(){
        return nama;
    }

    public String getIdPelanggan(){
        return IdPelanggan;
    }

    public Pelanggan(String nama, String IdPelanggan){
        this.nama = nama;
        this.IdPelanggan = IdPelanggan;
    }
}

interface IBisaDitagih {
    public void tampilkanStruk();
    
}