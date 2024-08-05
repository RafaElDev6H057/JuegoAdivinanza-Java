package vista;

import button.MyButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import logica.Logica;

public class GUI_MenuPrincipal extends javax.swing.JFrame {

    CardLayout cardLayout;
    String nombre;
    Logica obLogica;

    public GUI_MenuPrincipal() {
        initComponents();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cardLayout = (CardLayout) pnlCards.getLayout();
        obLogica = new Logica(pnlGridFacil, pnlGridMedio, pnlGridDificil, pnlCards, lblIntentos, lblJugadorFacil, lblSuerteJugador, cardLayout, nombre, txtNombre);

        // Agregar Botones Nivel Facil
        for (int i = 1; i <= 10; i++) {
            MyButton boton = new MyButton();
            boton.setText(String.valueOf(i));
            boton.setActionCommand(String.valueOf(i));
            boton.setFont(new Font("Arial", 3, 32));
            boton.setForeground(Color.WHITE);
            boton.setColor(new Color(88, 24, 69));
            boton.setColorOver(new Color(135, 37, 106));
            boton.setColorClick(new Color(78, 25, 63));
            boton.setBorderColor(new Color(78, 25, 63));
            boton.setRadius(20);
            pnlGridFacil.add(boton);
        }

        //Agregar Botones Nivel Medio
        for (int i = 1; i <= 30; i++) {
            MyButton boton = new MyButton();
            boton.setText(String.valueOf(i));
            boton.setActionCommand(String.valueOf(i));
            boton.setFont(new Font("Arial", 3, 32));
            boton.setForeground(Color.WHITE);
            boton.setColor(new Color(88, 24, 69));
            boton.setColorOver(new Color(135, 37, 106));
            boton.setColorClick(new Color(78, 25, 63));
            boton.setBorderColor(new Color(78, 25, 63));
            boton.setRadius(20);
            pnlGridMedio.add(boton);
        }
        
        //Agregar Botones Nivel Dificil
        for (int i = 1; i <= 50; i++) {
            MyButton boton = new MyButton();
            boton.setText(String.valueOf(i));
            boton.setActionCommand(String.valueOf(i));
            boton.setFont(new Font("Arial", 3, 32));
            boton.setForeground(Color.WHITE);
            boton.setColor(new Color(88, 24, 69));
            boton.setColorOver(new Color(135, 37, 106));
            boton.setColorClick(new Color(78, 25, 63));
            boton.setBorderColor(new Color(78, 25, 63));
            boton.setRadius(20);
            pnlGridDificil.add(boton);
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
        jPanel10 = new javax.swing.JPanel();
        lblSuerteJugador = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btnMenuPrincipal = new button.MyButton();
        jPanel15 = new javax.swing.JPanel();
        btnFacil = new button.MyButton();
        btnMedio = new button.MyButton();
        btnDificil = new button.MyButton();
        jLabel7 = new javax.swing.JLabel();
        pnlCardFacil = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblJugadorFacil = new javax.swing.JLabel();
        lblIntentos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlGridFacil = new javax.swing.JPanel();
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
        pnlCardDificil = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblJugadorDificil = new javax.swing.JLabel();
        lblIntentosDificil = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlGridDificil = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        btnSalirDificil = new javax.swing.JButton();

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

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Rafael");
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

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.GridBagLayout());

        lblSuerteJugador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel10.add(lblSuerteJugador, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel10, java.awt.BorderLayout.NORTH);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridBagLayout());
        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setLayout(new java.awt.GridBagLayout());

        btnMenuPrincipal.setBackground(new java.awt.Color(61, 152, 226));
        btnMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPrincipal.setText("Regresar");
        btnMenuPrincipal.setBorderColor(new java.awt.Color(29, 78, 136));
        btnMenuPrincipal.setColor(new java.awt.Color(61, 152, 226));
        btnMenuPrincipal.setColorClick(new java.awt.Color(159, 204, 240));
        btnMenuPrincipal.setColorOver(new java.awt.Color(20, 82, 132));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        jPanel14.add(btnMenuPrincipal, gridBagConstraints);

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_END);

        jPanel15.setLayout(new java.awt.GridBagLayout());

        btnFacil.setBackground(new java.awt.Color(25, 191, 52));
        btnFacil.setForeground(new java.awt.Color(255, 255, 255));
        btnFacil.setText("FACIL");
        btnFacil.setColor(new java.awt.Color(25, 191, 52));
        btnFacil.setColorOver(new java.awt.Color(23, 114, 37));
        btnFacil.setRadius(20);
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 79, 133, 0);
        jPanel15.add(btnFacil, gridBagConstraints);

        btnMedio.setBackground(new java.awt.Color(217, 159, 9));
        btnMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnMedio.setText("MEDIO");
        btnMedio.setBorderColor(new java.awt.Color(139, 105, 2));
        btnMedio.setColor(new java.awt.Color(217, 159, 9));
        btnMedio.setColorClick(new java.awt.Color(239, 207, 152));
        btnMedio.setColorOver(new java.awt.Color(144, 105, 6));
        btnMedio.setRadius(20);
        btnMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 39, 133, 0);
        jPanel15.add(btnMedio, gridBagConstraints);

        btnDificil.setBackground(new java.awt.Color(213, 64, 64));
        btnDificil.setForeground(new java.awt.Color(255, 255, 255));
        btnDificil.setText("DIFICIL");
        btnDificil.setBorderColor(new java.awt.Color(155, 4, 22));
        btnDificil.setColor(new java.awt.Color(213, 64, 64));
        btnDificil.setColorClick(new java.awt.Color(219, 150, 156));
        btnDificil.setColorOver(new java.awt.Color(125, 29, 29));
        btnDificil.setRadius(20);
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 39, 133, 0);
        jPanel15.add(btnDificil, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Selecciona la dificultad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 522;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(76, 0, 0, 2);
        jPanel15.add(jLabel7, gridBagConstraints);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11, java.awt.BorderLayout.CENTER);

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

        pnlCardDificil.setLayout(new java.awt.GridBagLayout());

        jPanel16.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel17.setLayout(new java.awt.GridBagLayout());

        lblJugadorDificil.setText("Jugador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel17.add(lblJugadorDificil, gridBagConstraints);

        lblIntentosDificil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntentosDificil.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel17.add(lblIntentosDificil, gridBagConstraints);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Selecciona el numero ganador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel17.add(jLabel6, gridBagConstraints);

        jPanel16.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        pnlGridDificil.setLayout(new java.awt.GridLayout(5, 10, 5, 5));
        jPanel16.add(pnlGridDificil, java.awt.BorderLayout.CENTER);

        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnSalirDificil.setText("Regresar");
        btnSalirDificil.setPreferredSize(new java.awt.Dimension(80, 50));
        btnSalirDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDificilActionPerformed(evt);
            }
        });
        jPanel18.add(btnSalirDificil);

        jPanel16.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardDificil.add(jPanel16, gridBagConstraints);

        pnlCards.add(pnlCardDificil, "cardDificil");

        jPanel1.add(pnlCards, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
        obLogica.iniciarJuegoAdivinanza();
    }//GEN-LAST:event_btnAdivinarActionPerformed

    private void btnSalirFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirFacilActionPerformed

        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirFacilActionPerformed

    private void btnSalirMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMedioActionPerformed
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirMedioActionPerformed

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        obLogica.iniciarFacil();
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedioActionPerformed
        obLogica.iniciarMedio(lblJugadorMedio, lblIntentosMedio);
    }//GEN-LAST:event_btnMedioActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        obLogica.menuPrincipal();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnSalirDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDificilActionPerformed
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirDificilActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        obLogica.iniciarDificil(lblJugadorDificil, lblIntentosDificil);
    }//GEN-LAST:event_btnDificilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinar;
    private button.MyButton btnDificil;
    private button.MyButton btnFacil;
    private button.MyButton btnMedio;
    private button.MyButton btnMenuPrincipal;
    private javax.swing.JButton btnSalirDificil;
    private javax.swing.JButton btnSalirFacil;
    private javax.swing.JButton btnSalirMedio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblIntentosDificil;
    private javax.swing.JLabel lblIntentosMedio;
    private javax.swing.JLabel lblJugadorDificil;
    private javax.swing.JLabel lblJugadorFacil;
    private javax.swing.JLabel lblJugadorMedio;
    private javax.swing.JLabel lblSuerteJugador;
    private javax.swing.JPanel pnlCardDificil;
    private javax.swing.JPanel pnlCardDificultad;
    private javax.swing.JPanel pnlCardFacil;
    private javax.swing.JPanel pnlCardInicio;
    private javax.swing.JPanel pnlCardMedio;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlGridDificil;
    private javax.swing.JPanel pnlGridFacil;
    private javax.swing.JPanel pnlGridMedio;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
