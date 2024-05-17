
package EscaleraSerpientes;



public class SeleccionarJuego extends javax.swing.JFrame {

    
    public SeleccionarJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        
       this.seleccionarJugadores.actionPerformed(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTablero10x10 = new javax.swing.JButton();
        btnTablero13x13 = new javax.swing.JButton();
        btnTablero15x15 = new javax.swing.JButton();
        seleccionarJugadores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador3 = new javax.swing.JTextField();
        txtJugador4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFicha1 = new javax.swing.JComboBox<>();
        txtFicha3 = new javax.swing.JComboBox<>();
        txtFicha2 = new javax.swing.JComboBox<>();
        txtFicha4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MENU DE INICIO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ELEGIR NÚMERO DE JUGADORES");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ELEGIR TAMAÑO DEL TABLERO");

        btnTablero10x10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTablero10x10.setText("10 x 10");
        btnTablero10x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablero10x10ActionPerformed(evt);
            }
        });

        btnTablero13x13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTablero13x13.setText("13 x 13");
        btnTablero13x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablero13x13ActionPerformed(evt);
            }
        });

        btnTablero15x15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTablero15x15.setText("15 x 15");
        btnTablero15x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablero15x15ActionPerformed(evt);
            }
        });

        seleccionarJugadores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seleccionarJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 JUGADORES\t", "3 JUGADORES", "4 JUGADORES" }));
        seleccionarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarJugadoresActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("PRIMER JUGADOR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SEGUNDO JUGADOR");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("TERCER JUGADOR");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CUARTO JUGADOR");

        txtJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugador1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("FICHA ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("FICHA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("FICHA");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("FICHA");

        txtFicha1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFicha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬" }));

        txtFicha3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFicha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬" }));

        txtFicha2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFicha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬" }));

        txtFicha4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFicha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(seleccionarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtJugador1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(txtFicha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJugador2))
                            .addComponent(jLabel9)
                            .addComponent(txtFicha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJugador3))
                            .addComponent(jLabel10)
                            .addComponent(txtFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJugador4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTablero10x10)
                        .addGap(18, 18, 18)
                        .addComponent(btnTablero13x13)
                        .addGap(18, 18, 18)
                        .addComponent(btnTablero15x15)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFicha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFicha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTablero10x10)
                    .addComponent(btnTablero13x13)
                    .addComponent(btnTablero15x15))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarJugadoresActionPerformed
       switch (this.seleccionarJugadores.getSelectedIndex()) {
            case 0:
                this.cambiarJugador3(false);
                this.cambiarJugador4(false);
                break;
            case 1:
                this.cambiarJugador3(true);
                this.cambiarJugador4(false);
                break;
            case 2:
                this.cambiarJugador3(true);
                this.cambiarJugador4(true);
                break;
            default:
                break;
        }

    }

    private void cambiarJugador3(boolean fase){
        this.jLabel8.setVisible(fase);
            this.jLabel10.setVisible(fase);
            this.txtJugador3.setVisible(fase);
            this.jLabel6.setVisible(fase);
            this.txtFicha3.setVisible(fase);
    }
    private void cambiarJugador4(boolean fase){
        this.jLabel9.setVisible(fase);
            this.jLabel11.setVisible(fase);
            this.txtJugador4.setVisible(fase);
            this.jLabel7.setVisible(fase);
            this.txtFicha4.setVisible(fase);
    
    }//GEN-LAST:event_seleccionarJugadoresActionPerformed

    private void btnTablero10x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablero10x10ActionPerformed
        Tablero10x10 abrir10x10= new Tablero10x10();
        abrir10x10.setVisible(true);
        this.setVisible(false);
        
        String nombreJugador1Tablero10x10=txtJugador1.getText();
        String nombreJugador2Tablero10x10=txtJugador2.getText();
        String nombreJugador3Tablero10x10=txtJugador3.getText();
        String nombreJugador4Tablero10x10=txtJugador4.getText();
        
        Tablero10x10.txtMostrarJugador1Tablero10x10.setText(nombreJugador1Tablero10x10);
        Tablero10x10.txtMostrarJugador1Tablero10x10.setText(nombreJugador2Tablero10x10);
        Tablero10x10.txtMostrarJugador3Tablero10x10.setText(nombreJugador3Tablero10x10);
        Tablero10x10.txtMostrarJugador4Tablero10x10.setText(nombreJugador4Tablero10x10);
        
       
    }//GEN-LAST:event_btnTablero10x10ActionPerformed

    private void btnTablero13x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablero13x13ActionPerformed
        Tablero13x13 abrir13x13= new Tablero13x13();
        abrir13x13.setVisible(true);
        this.setVisible(false);
     
        String nombreJugador1Tablero13x13=txtJugador1.getText();
        String nombreJugador2Tablero13x13=txtJugador2.getText();
        String nombreJugador3Tablero13x13=txtJugador3.getText();
        String nombreJugador4Tablero13x13=txtJugador4.getText();
        
        Tablero13x13.txtMostrarJugador1Tablero13x13.setText(nombreJugador1Tablero13x13);
        Tablero13x13.txtMostrarJugador2Tablero13x13.setText(nombreJugador2Tablero13x13);
        Tablero13x13.txtMostrarJugador3Tablero13x13.setText(nombreJugador3Tablero13x13);
        Tablero13x13.txtMostrarJugador4Tablero13x13.setText(nombreJugador4Tablero13x13);
        
    }//GEN-LAST:event_btnTablero13x13ActionPerformed

    private void txtJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugador1ActionPerformed

    private void btnTablero15x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablero15x15ActionPerformed
        // TODO add your handling code here:
     Tablero15x15 abrir15x15= new Tablero15x15();
        abrir15x15.setVisible(true);
        this.setVisible(false);
     
        String nombreJugador1Tablero15x15=txtJugador1.getText();
        String nombreJugador2Tablero15x15=txtJugador2.getText();
        String nombreJugador3Tablero15x15=txtJugador3.getText();
        String nombreJugador4Tablero15x15=txtJugador4.getText();
        
        Tablero15x15.txtMostrarJugador1Tablero15x15.setText(nombreJugador1Tablero15x15);
        Tablero15x15.txtMostrarJugador2Tablero15x15.setText(nombreJugador2Tablero15x15);
        Tablero15x15.txtMostrarJugador3Tablero15x15.setText(nombreJugador3Tablero15x15);
        Tablero15x15.txtMostrarJugador4Tablero15x15.setText(nombreJugador4Tablero15x15);
    }//GEN-LAST:event_btnTablero15x15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeleccionarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarJuego().setVisible(true);
                   }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JButton btnTablero10x10;
    private javax.swing.JButton btnTablero13x13;
    private javax.swing.JButton btnTablero15x15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> seleccionarJugadores;
    private javax.swing.JComboBox<String> txtFicha1;
    private javax.swing.JComboBox<String> txtFicha2;
    private javax.swing.JComboBox<String> txtFicha3;
    private javax.swing.JComboBox<String> txtFicha4;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    private javax.swing.JTextField txtJugador3;
    private javax.swing.JTextField txtJugador4;
    // End of variables declaration//GEN-END:variables
}
