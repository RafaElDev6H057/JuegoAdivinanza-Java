/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Insets;

/**
 *
 * @author Rafael
 */
public class GUI_ComoJugar extends javax.swing.JFrame {

    /**
     * Creates new form GUI_ComoJugar
     */
    public GUI_ComoJugar() {
        initComponents();
        panelGlowingGradient2.getInsets(new Insets(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelGlowingGradient2 = new componentes.PanelGlowingGradient();
        panelRound1 = new test.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound2 = new test.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("¿Como se Juega?");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        panelGlowingGradient2.setBackground(new java.awt.Color(51, 51, 51));
        panelGlowingGradient2.setBackgroundLight(new java.awt.Color(51, 51, 51));
        panelGlowingGradient2.setBorderSize(1);
        panelGlowingGradient2.setGradientColor1(new java.awt.Color(167, 9, 75));
        panelGlowingGradient2.setGradientColor2(new java.awt.Color(211, 35, 125));
        panelGlowingGradient2.setPreferredSize(new java.awt.Dimension(600, 350));
        panelGlowingGradient2.setLayout(new java.awt.BorderLayout(0, 10));

        panelRound1.setBackground(new java.awt.Color(176, 40, 231));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("¿Como se Juega?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 30;
        panelRound1.add(jLabel1, gridBagConstraints);

        panelGlowingGradient2.add(panelRound1, java.awt.BorderLayout.PAGE_START);

        panelRound2.setLayout(new javax.swing.BoxLayout(panelRound2, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBackground(new java.awt.Color(119, 23, 178));
        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(119, 23, 178));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenido al emocionante juego de adivinanza de números. \n¡Prepárate para poner a prueba tu intuición y suerte! Aquí te explico cómo \npuedes jugar:\n\nTu objetivo es adivinar el número secreto que ha sido seleccionado \naleatoriamente dentro de un rango específico. Puedes elegir entre tres niveles \nde dificultad, cada uno con su propio rango de números.\n\nNivel Fácil:\n  -Adivina un número entre 1 y 10. Ideal para principiantes o para calentar \n   motores. ¡Empieza con confianza!\n \nNivel Medio:\n  -Adivina un número entre 1 y 30. Un desafío mayor que pondrá a prueba tu \n   habilidad para reducir opciones y tomar decisiones estratégicas.\n\nNivel Difícil:\n  -Adivina un número entre 1 y 50. Solo para los valientes. ¿Tienes lo que se \n   necesita para vencer a la suerte?\n\n                                      MUCHA SUERTE WAPETON/A :D");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretPosition(0);
        jTextArea1.setMargin(new java.awt.Insets(20, 20, 20, 20));
        jScrollPane1.setViewportView(jTextArea1);

        panelRound2.add(jScrollPane1);

        panelGlowingGradient2.add(panelRound2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelGlowingGradient2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI_ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ComoJugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private componentes.PanelGlowingGradient panelGlowingGradient2;
    private test.PanelRound panelRound1;
    private test.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
