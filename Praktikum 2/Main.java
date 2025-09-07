public class Main
{
    public static void main(String[] args)
    {
        // mendeklarasikan dan menginisialisasi variabel
        String nama = "Rahma Otoyadi";
        String nim = "2407111310";
        String alamat = "Jalan GAruda Sakti";
        int umur = 19;
        char golonganDarah = 'A';

        // menyimpan IP ke dalam sebuah array
        double[] ip = {3.43, 3.64};

        // Konversi IP dari double ke byte
        byte ipByte1 = (byte) ip[0];
        byte ipByte2 = (byte) ip[1];

        // Mmenampilkan biodata
        System.out.println("------- BIODATA RAHMA OKTOYADI -------");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Indeks Pretasi Semester 1 : " + ip[0]);
        System.out.println("Indeks Prestasi Semester 2 : " + ip[1]);
        System.out.println("IP Semester 1 dalam bentuk byte : " + ipByte1);
        System.out.println("IP Semester 2 dalam bentukbyte : " + ipByte2);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
        System.out.println("Golongan Darah : " + golonganDarah);

    }
}


