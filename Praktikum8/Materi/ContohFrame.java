package Praktikum8.Materi;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ContohFrame {
    public static void maian(String[] args) {
        // Membuat JFrame
        JFrame frame = new JFrame("Judul Window");

        //Mengatur ukuran (Lebar, Tinggi)
        frame.setSize(400, 300);

        // Mengatur operasi saat window ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat window terlihat
        frame.setVisible(true);

        //(opsional) Mengatur posisi window di tengah layar
        frame.setLocationRelativeTo(null);



        // Label dengan teks
        JLabel label1 = new JLabel("Nama:")

        // Label dengan teks dan aligment
        JLabel label2 = new JLabel("Selamat datang", SwingConstants.CENTER);

        // Label dengan Gambar
        ImageIcon icon = new ImageIcon("path/to/image.jpg");
        JLabel label3 = new JLabel(icon);

        // Label dengan teks dan gambar
        JLabel label4 = new JLabel("User", icon, SwingConstants.LEFT);

        // Mengubah teks label
        label1.setText("Ussername:");

        // mengubah font dan warna 
        label1.setFont(new font("Arial", Font.BOLD, 16));
        label1.setForeground(Color.BLUE);



        // TextField kosong dengan lebar 20 karakter
        JTextField textField1 = new JTextField(20);

        // Textfield dengan teks default 
        JTextField textField2 = new JTextField("Teks Default");

        // TextField dengan teks dan lebar
        JTextField textField3 = new JTextField("Hello", 15);

        // mendapatkan teks dari textfield
        String input = textField1.getText();

        // mengatur teks 
        teztfield1.setText("Teks Baru");



        // Button dengan teks 
        JButton button1= new JButton("Klik saya");

        // button dengan gambar 
        ImageIcon icon = new ImageIcon("icon.png");
        JButton button2 = new JButton(icon);

        // button dengan teks dan gambar
        JButton button3 = new JButton("Submit", icon);

        // mengatur warna background dan foreground 
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
    }
    
}
