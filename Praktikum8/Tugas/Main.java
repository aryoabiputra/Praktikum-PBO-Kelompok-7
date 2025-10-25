package Praktikum8.Tugas;

public class Main {

    public static void main(String[] args) {
        // Menjalankan GUI di thread Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Kalkulator().setVisible(true);
        });
    }
}

