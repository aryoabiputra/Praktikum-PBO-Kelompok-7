package Praktikum9;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LihatDataPanel extends javax.swing.JPanel {

    public LihatDataPanel() {
        initComponents();
        loadData();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Lihat Data Mahasiswa");

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Nama", "NIM", "Prodi", "Jenis Kelamin", "Status"}
        ));
        jScrollPane1.setViewportView(mahasiswaTable);

        updateButton.setText("Update");
        updateButton.addActionListener(evt -> updateButtonActionPerformed(evt));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(evt -> deleteButtonActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }

    public void loadData() {
        String[] column = {"Nama", "NIM", "Prodi", "Jenis Kelamin", "Status"};
        DefaultTableModel table = new DefaultTableModel(null, column) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Mahasiswa mhs : Mahasiswa.mahasiswas) {
            table.addRow(new String[]{
                mhs.getNama(),
                mhs.getNim(),
                mhs.getProdi(),
                mhs.getJenisKelamin(),
                mhs.isIsActive() ? "Aktif" : "Tidak Aktif"
            });
        }
        mahasiswaTable.setModel(table);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = mahasiswaTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nim = mahasiswaTable.getValueAt(selectedRow, 1).toString();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus mahasiswa dengan NIM " + nim + "?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            Mahasiswa target = null;
            for (Mahasiswa m : Mahasiswa.mahasiswas) {
                if (m.getNim().equals(nim)) {
                    target = m;
                    break;
                }
            }

            if (target != null) {
                Mahasiswa.mahasiswas.remove(target);
                loadData();
                JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil dihapus.");
            }
        }
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = mahasiswaTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diupdate!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nim = mahasiswaTable.getValueAt(selectedRow, 1).toString();
        Mahasiswa target = null;
        for (Mahasiswa m : Mahasiswa.mahasiswas) {
            if (m.getNim().equals(nim)) {
                target = m;
                break;
            }
        }

        if (target == null) {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JTextField namaField = new JTextField(target.getNama());
        JTextField nimField = new JTextField(target.getNim());

        String[] prodiOptions = {
            "S1 Teknik Informatika",
            "S1 Teknik Elektro",
            "D3 Teknik Elektro"
        };
        JComboBox<String> prodiBox = new JComboBox<>(prodiOptions);
        prodiBox.setSelectedItem(target.getProdi());

        String[] genderOptions = {"Laki-laki", "Perempuan"};
        JComboBox<String> genderBox = new JComboBox<>(genderOptions);
        genderBox.setSelectedItem(target.getJenisKelamin());

        JCheckBox activeCheck = new JCheckBox("Aktif", target.isIsActive());

        JPanel panel = new JPanel(new java.awt.GridLayout(0, 1));
        panel.add(new JLabel("Nama:"));
        panel.add(namaField);
        panel.add(new JLabel("NIM:"));
        panel.add(nimField);
        panel.add(new JLabel("Prodi:"));
        panel.add(prodiBox);
        panel.add(new JLabel("Jenis Kelamin:"));
        panel.add(genderBox);
        panel.add(activeCheck);

        int result = JOptionPane.showConfirmDialog(this, panel,
            "Edit Data Mahasiswa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String newNama = namaField.getText().trim();
            String newNim = nimField.getText().trim();
            String newProdi = (String) prodiBox.getSelectedItem();
            String newGender = (String) genderBox.getSelectedItem();
            boolean newStatus = activeCheck.isSelected();

            if (newNama.isEmpty() || newNim.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field wajib diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!newNim.equals(target.getNim())) {
                for (Mahasiswa m : Mahasiswa.mahasiswas) {
                    if (m.getNim().equals(newNim)) {
                        JOptionPane.showMessageDialog(this, "NIM sudah terdaftar!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            target.setNama(newNama);
            target.setNim(newNim);
            target.setProdi(newProdi);
            target.setJenisKelamin(newGender);
            target.setIsActive(newStatus);

            loadData();
            JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil diupdate!");
        }
    }

    // Variables declaration
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration
}
