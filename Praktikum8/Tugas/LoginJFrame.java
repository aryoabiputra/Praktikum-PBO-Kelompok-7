package com.mycompany.praktikum8;

import java.awt.*;

public class LoginJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginJFrame.class.getName());

    public LoginJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        alertLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        buttonLogin.setBackground(new java.awt.Color(51, 255, 255));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        alertLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alertLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(buttonLogin))
                            .addComponent(passwordTextField))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(alertLabel))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>                        

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        if(username.equals("Andri") && password.equals("123")){
            alertLabel.setText("Login Berhasil");
            alertLabel.setForeground(Color.blue);
        }else {
            alertLabel.setText("Login Gagal");
            alertLabel.setForeground(Color.red);
        }
    }                                           

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginJFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel alertLabel;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration                   
}
