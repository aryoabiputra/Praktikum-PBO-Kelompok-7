public class Main
{
    public static void main(String[] args)
    {
        //menginisialisasi variabel
        String nama = "Rahma Oktoyadi";
        String nim = "2407111310";
        String alamat = "Jalan Garuda Sakti";
        int umur = 19;
        char golonganDarah = 'A';

        //menyimpan ip ke dalam array
        double[] IP = {3.5, 3.64};

        //konversi ke dalam bentuk byte
        byte ipbyte = (byte) IP[0];
        byte ipbyte2 = (byte) IP[1];

        //Menampilkan semua variabel ke layar
        System.out.println("***Biodata Rahma Oktoyadi****");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IP Semsester 1 : " + IP[0]);
        System.out.println("IP Semsester 2 : " + IP[1]);
        System.out.println("IP Semsester 1 dalam bentuk byte : " + ipbyte);
        System.out.println("IP Semsester 2 dalam bentuk byte : " + ipbyte2);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Golongan darah : " + golonganDarah);
    }
}

