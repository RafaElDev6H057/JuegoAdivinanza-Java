package vista;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import logica.Logica;

public class GUI_MenuPrincipal extends javax.swing.JFrame {

    CardLayout cardLayout;
    String nombre;
    Logica obLogica;

    public GUI_MenuPrincipal() {
        initComponents();
        cardLayout = (CardLayout) pnlCards.getLayout();
        obLogica = new Logica(pnlGridFacil, pnlGridMedio, pnlCards, lblIntentos, lblJugadorFacil, lblSuerteJugador, cardLayout, nombre, txtNombre);

        for (int i = 1; i <= 30; i++) {
            JButton boton = new JButton(String.valueOf(i));
            boton.setActionCommand(String.valueOf(i)); // Comando de acción
            pnlGridMedio.add(boton); // Añadir botón al panel
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        pnlCardInicio = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAdivinar = new javax.swing.JButton();
        pnlCardDificultad = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnFacil = new javax.swing.JButton();
        btnRegresarAMenu = new javax.swing.JButton();
        lblSuerteJugador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNormal = new javax.swing.JButton();
        pnlCardFacil = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblJugadorFacil = new javax.swing.JLabel();
        lblIntentos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlGridFacil = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnSalirFacil = new javax.swing.JButton();
        pnlCardMedio = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblJugadorMedio = new javax.swing.JLabel();
        lblIntentosMedio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlGridMedio = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnSalirMedio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADIVINATOR 3000");
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 80));
        pnlHeader.add(jLabel1);

        jPanel1.add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlCards.setLayout(new java.awt.CardLayout());

        pnlCardInicio.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText(" Ingresa tu bello nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 250, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(110, 250, 0, 221);
        jPanel3.add(txtNombre, gridBagConstraints);

        btnAdivinar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdivinar.setText("ADIVINAR!");
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 260, 31, 0);
        jPanel3.add(btnAdivinar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardInicio.add(jPanel3, gridBagConstraints);

        pnlCards.add(pnlCardInicio, "cardInicio");

        pnlCardDificultad.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("DIFICIL");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 190, 90));

        btnFacil.setText("FACIL");
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });
        jPanel2.add(btnFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 90));

        btnRegresarAMenu.setText("Regresar");
        btnRegresarAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresarAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 150, 50));

        lblSuerteJugador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSuerteJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblSuerteJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecciona la Dificultad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 290, 30));

        btnNormal.setText("MEDIO");
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });
        jPanel2.add(btnNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 190, 90));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardDificultad.add(jPanel2, gridBagConstraints);

        pnlCards.add(pnlCardDificultad, "cardDificultad");

        pnlCardFacil.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel5.setLayout(new java.awt.GridBagLayout());

        lblJugadorFacil.setText("Jugador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel5.add(lblJugadorFacil, gridBagConstraints);

        lblIntentos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntentos.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel5.add(lblIntentos, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona el numero ganador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel5.add(jLabel2, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        pnlGridFacil.setLayout(new java.awt.GridLayout(2, 5, 5, 5));

        jButton4.setText("1");
        jButton4.setName("1"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlGridFacil.add(jButton4);

        jButton5.setText("2");
        jButton5.setName("2"); // NOI18N
        pnlGridFacil.add(jButton5);

        jButton6.setText("3");
        jButton6.setName("3"); // NOI18N
        pnlGridFacil.add(jButton6);

        jButton7.setText("4");
        jButton7.setName("4"); // NOI18N
        pnlGridFacil.add(jButton7);

        jButton8.setText("5");
        jButton8.setName("5"); // NOI18N
        pnlGridFacil.add(jButton8);

        jButton9.setText("6");
        jButton9.setName("6"); // NOI18N
        pnlGridFacil.add(jButton9);

        jButton10.setText("7");
        jButton10.setName("7"); // NOI18N
        pnlGridFacil.add(jButton10);

        jButton11.setText("8");
        jButton11.setName("8"); // NOI18N
        pnlGridFacil.add(jButton11);

        jButton12.setText("9");
        jButton12.setName("9"); // NOI18N
        pnlGridFacil.add(jButton12);

        jButton13.setText("10");
        jButton13.setName("10"); // NOI18N
        pnlGridFacil.add(jButton13);

        jPanel4.add(pnlGridFacil, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnSalirFacil.setText("Regresar");
        btnSalirFacil.setPreferredSize(new java.awt.Dimension(80, 50));
        btnSalirFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirFacilActionPerformed(evt);
            }
        });
        jPanel7.add(btnSalirFacil);

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardFacil.add(jPanel4, gridBagConstraints);

        pnlCards.add(pnlCardFacil, "cardFacil");

        pnlCardMedio.setLayout(new java.awt.GridBagLayout());

        jPanel6.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel8.setLayout(new java.awt.GridBagLayout());

        lblJugadorMedio.setText("Jugador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel8.add(lblJugadorMedio, gridBagConstraints);

        lblIntentosMedio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntentosMedio.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel8.add(lblIntentosMedio, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selecciona el numero ganador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel8.add(jLabel5, gridBagConstraints);

        jPanel6.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        pnlGridMedio.setLayout(new java.awt.GridLayout(5, 6, 5, 5));
        jPanel6.add(pnlGridMedio, java.awt.BorderLayout.CENTER);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnSalirMedio.setText("Regresar");
        btnSalirMedio.setPreferredSize(new java.awt.Dimension(80, 50));
        btnSalirMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMedioActionPerformed(evt);
            }
        });
        jPanel9.add(btnSalirMedio);

        jPanel6.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardMedio.add(jPanel6, gridBagConstraints);

        pnlCards.add(pnlCardMedio, "cardMedio");

        jPanel1.add(pnlCards, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
        obLogica.iniciarJuegoAdivinanza();
    }//GEN-LAST:event_btnAdivinarActionPerformed

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
//        setExtendedState(this.MAXIMIZED_BOTH);
        obLogica.iniciarFacil();
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnRegresarAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarAMenuActionPerformed
        obLogica.menuPrincipal();
    }//GEN-LAST:event_btnRegresarAMenuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        generarNumeroFacil();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSalirFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirFacilActionPerformed
//        cardLayout.show(pnlCards, "cardDificultad");
//        setSize(822, 544);
//        setLocationRelativeTo(null);
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirFacilActionPerformed

    private void btnSalirMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMedioActionPerformed
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirMedioActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        obLogica.iniciarMedio(lblJugadorMedio, lblIntentosMedio);
    }//GEN-LAST:event_btnNormalActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_MenuPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinar;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnNormal;
    private javax.swing.JButton btnRegresarAMenu;
    private javax.swing.JButton btnSalirFacil;
    private javax.swing.JButton btnSalirMedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblIntentosMedio;
    private javax.swing.JLabel lblJugadorFacil;
    private javax.swing.JLabel lblJugadorMedio;
    private javax.swing.JLabel lblSuerteJugador;
    private javax.swing.JPanel pnlCardDificultad;
    private javax.swing.JPanel pnlCardFacil;
    private javax.swing.JPanel pnlCardInicio;
    private javax.swing.JPanel pnlCardMedio;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlGridFacil;
    private javax.swing.JPanel pnlGridMedio;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
