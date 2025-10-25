package Praktikum8.Tugas;   
public class Kalkulator extends javax.swing.JFrame {

    double num1, num2, result;
    String operator;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Kalkulator.class.getName());

    public Kalkulator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setBackground(new java.awt.Color(25, 25, 25));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(5, 4, 5, 5));

        btn1.setBackground(new java.awt.Color(60, 60, 60));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setBackground(new java.awt.Color(60, 60, 60));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setBackground(new java.awt.Color(60, 60, 60));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        btnTambah.setBackground(new java.awt.Color(255, 140, 0));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah);

        btn4.setBackground(new java.awt.Color(60, 60, 60));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setBackground(new java.awt.Color(60, 60, 60));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setBackground(new java.awt.Color(60, 60, 60));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btnKurang.setBackground(new java.awt.Color(255, 140, 0));
        btnKurang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        jPanel1.add(btnKurang);

        btn7.setBackground(new java.awt.Color(60, 60, 60));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setBackground(new java.awt.Color(60, 60, 60));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.setBackground(new java.awt.Color(60, 60, 60));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        btnKali.setBackground(new java.awt.Color(255, 140, 0));
        btnKali.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKali.setText("×");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKali);

        btnDot.setBackground(new java.awt.Color(60, 60, 60));
        btnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDot.setForeground(new java.awt.Color(255, 255, 255));
        btnDot.setText(".");
        btnDot.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        jPanel1.add(btnDot);

        btn0.setBackground(new java.awt.Color(60, 60, 60));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 25, 25)));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);

        btnEqual.setBackground(new java.awt.Color(0, 120, 255));
        btnEqual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(255, 255, 255));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        jPanel1.add(btnEqual);

        btnBagi.setBackground(new java.awt.Color(255, 140, 0));
        btnBagi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBagi.setText("÷");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        jPanel1.add(btnBagi);

        btnClear.setBackground(new java.awt.Color(220, 50, 47));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);

        jPanel2.setLayout(new java.awt.GridLayout());

        txtDisplay.setBackground(new java.awt.Color(200, 200, 200));
        txtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setBorder(new javax.swing.border.MatteBorder(null));
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        jPanel2.add(txtDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "1");
    }                                    

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (!txtDisplay.getText().contains(".")) {
            txtDisplay.setText(txtDisplay.getText() + ".");
        }
    }                                      

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "2");
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "3");
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "4");
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "5");
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "6");
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "7");
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "8");
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "9");
    }                                    

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText(txtDisplay.getText() + "0");
    }                                    

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {                                          
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "+";
        txtDisplay.setText("");
    }                                         

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {                                          
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "-";
        txtDisplay.setText("");
    }                                         

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = "x";
        txtDisplay.setText("");
    }                                       

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num1 = Double.parseDouble(txtDisplay.getText());
        operator = ":";
        txtDisplay.setText("");
    }                                       

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {                                         
        num2 = Double.parseDouble(txtDisplay.getText());

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "x":
                result = num1 * num2;
                break;
            case ":":
                if (num2 == 0) {
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
        }

        txtDisplay.setText(String.valueOf(result));

    }                                        

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtDisplay.setText("");
        num1 = num2 = result = 0;
        operator = "";
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
        java.awt.EventQueue.invokeLater(() -> new Kalkulator().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnTambah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration                   
}
