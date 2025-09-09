public class Main {

    public static void main(String[] args) {
        // mendeklarasikan dan menginisialisasi variabel
        String nama = "Aryo Abi Putra";
        final long nim = 2407111242L;

        // menyimpan IP ke dalam sebuah array
        double[] ip = {3.6, 3.69};
        String alamat = "Jalan Bangau Sakti";
        int umur = 20;
        char golonganDarah = '-';

        // Konversi IP dari double ke byte
        byte ipByte = (byte) ip[0];
        byte ipByte2 = (byte) ip[1];

        // Mmenampilkan biodata
        System.out.println("------- BIODATA ARYO -------");
        System.out.println("Nama                            : " + nama);
        System.out.println("NIM                             : " + nim);
        System.out.println("IP Semester 1                   : " + ip[0]);
        System.out.println("IP Semester 2                   : " + ip[1]);
        System.out.println("IP Semester 1 dalam bentuk byte : " + ipByte);
        System.out.println("IP Semester 2 dalam bentukbyte  : " + ipByte2);
        System.out.println("Alamat                          : " + alamat);
        System.out.println("Umur                            : " + umur);
        System.out.println("Golongan Darah                  : " + golonganDarah);
    }
}