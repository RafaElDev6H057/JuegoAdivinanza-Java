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
        btnSalir = new button.MyButton();
        btnAdivinar = new button.MyButton();
        btnComoJugar = new button.MyButton();
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
        btnSalirFacil = new button.MyButton();
        pnlCardMedio = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblJugadorMedio = new javax.swing.JLabel();
        lblIntentosMedio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlGridMedio = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        btnSalirMedio = new button.MyButton();
        pnlCardDificil = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblJugadorDificil = new javax.swing.JLabel();
        lblIntentosDificil = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlGridDificil = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnSalirDificil = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Adivinar Numero Secreto");

        jPanel1.setLayout(new java.awt.BorderLayout());

        pnlHeader.setBackground(new java.awt.Color(36, 0, 71));
        pnlHeader.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADIVINATOR 3000");
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 80));
        pnlHeader.add(jLabel1);

        jPanel1.add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlCards.setBackground(new java.awt.Color(0, 169, 212));
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlCardInicio.setBackground(new java.awt.Color(28, 49, 102));
        pnlCardInicio.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(28, 49, 102));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Ingresa tu bello nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 250, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        txtNombre.setBackground(new java.awt.Color(0, 169, 212));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(90, 250, 0, 222);
        jPanel3.add(txtNombre, gridBagConstraints);

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorderColor(new java.awt.Color(85, 5, 27));
        btnSalir.setColor(new java.awt.Color(113, 6, 35));
        btnSalir.setColorClick(new java.awt.Color(85, 5, 27));
        btnSalir.setColorOver(new java.awt.Color(194, 9, 59));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setRadius(20);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 260, 4, 0);
        jPanel3.add(btnSalir, gridBagConstraints);

        btnAdivinar.setBackground(new java.awt.Color(36, 0, 71));
        btnAdivinar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdivinar.setText("¡ADIVINAR!");
        btnAdivinar.setBorderColor(new java.awt.Color(27, 3, 50));
        btnAdivinar.setColor(new java.awt.Color(36, 0, 71));
        btnAdivinar.setColorClick(new java.awt.Color(27, 3, 50));
        btnAdivinar.setColorOver(new java.awt.Color(68, 0, 134));
        btnAdivinar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdivinar.setRadius(20);
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 260, 0, 0);
        jPanel3.add(btnAdivinar, gridBagConstraints);

        btnComoJugar.setBackground(new java.awt.Color(28, 0, 33));
        btnComoJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnComoJugar.setText("¿COMO SE JUEGA?");
        btnComoJugar.setBorderColor(new java.awt.Color(46, 5, 53));
        btnComoJugar.setColor(new java.awt.Color(28, 0, 33));
        btnComoJugar.setColorClick(new java.awt.Color(46, 5, 53));
        btnComoJugar.setColorOver(new java.awt.Color(77, 0, 91));
        btnComoJugar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComoJugar.setRadius(20);
        btnComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoJugarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 260, 0, 0);
        jPanel3.add(btnComoJugar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardInicio.add(jPanel3, gridBagConstraints);

        pnlCards.add(pnlCardInicio, "cardInicio");

        pnlCardDificultad.setBackground(new java.awt.Color(28, 49, 102));
        pnlCardDificultad.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(28, 49, 102));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(28, 49, 102));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        lblSuerteJugador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel10.add(lblSuerteJugador, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel10, java.awt.BorderLayout.NORTH);

        jPanel11.setBackground(new java.awt.Color(28, 49, 102));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(28, 49, 102));
        jPanel12.setLayout(new java.awt.GridBagLayout());
        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(28, 49, 102));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(28, 49, 102));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        btnMenuPrincipal.setBackground(new java.awt.Color(61, 152, 226));
        btnMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPrincipal.setText("Regresar");
        btnMenuPrincipal.setBorderColor(new java.awt.Color(29, 78, 136));
        btnMenuPrincipal.setColor(new java.awt.Color(61, 152, 226));
        btnMenuPrincipal.setColorClick(new java.awt.Color(159, 204, 240));
        btnMenuPrincipal.setColorOver(new java.awt.Color(20, 82, 132));
        btnMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMenuPrincipal.setRadius(20);
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

        jPanel15.setBackground(new java.awt.Color(28, 49, 102));
        jPanel15.setLayout(new java.awt.GridBagLayout());

        btnFacil.setBackground(new java.awt.Color(25, 191, 52));
        btnFacil.setForeground(new java.awt.Color(255, 255, 255));
        btnFacil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\JuegoAdivinarNumero\\src\\main\\java\\img\\mood-happy (1).png")); // NOI18N
        btnFacil.setText("FACIL");
        btnFacil.setColor(new java.awt.Color(25, 191, 52));
        btnFacil.setColorOver(new java.awt.Color(23, 114, 37));
        btnFacil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFacil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacil.setRadius(20);
        btnFacil.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 107, 0);
        jPanel15.add(btnFacil, gridBagConstraints);

        btnMedio.setBackground(new java.awt.Color(217, 159, 9));
        btnMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnMedio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\JuegoAdivinarNumero\\src\\main\\java\\img\\mood-empty.png")); // NOI18N
        btnMedio.setText("MEDIO");
        btnMedio.setBorderColor(new java.awt.Color(217, 159, 9));
        btnMedio.setColor(new java.awt.Color(217, 159, 9));
        btnMedio.setColorClick(new java.awt.Color(239, 207, 152));
        btnMedio.setColorOver(new java.awt.Color(144, 105, 6));
        btnMedio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMedio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedio.setRadius(20);
        btnMedio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 76, 107, 0);
        jPanel15.add(btnMedio, gridBagConstraints);

        btnDificil.setBackground(new java.awt.Color(213, 64, 64));
        btnDificil.setForeground(new java.awt.Color(255, 255, 255));
        btnDificil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Documents\\NetBeansProjects\\JuegoAdivinarNumero\\src\\main\\java\\img\\mood-angry.png")); // NOI18N
        btnDificil.setText("DIFICIL");
        btnDificil.setBorderColor(new java.awt.Color(155, 4, 22));
        btnDificil.setColor(new java.awt.Color(213, 64, 64));
        btnDificil.setColorClick(new java.awt.Color(219, 150, 156));
        btnDificil.setColorOver(new java.awt.Color(125, 29, 29));
        btnDificil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDificil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDificil.setRadius(20);
        btnDificil.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 76, 107, 0);
        jPanel15.add(btnDificil, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Selecciona la dificultad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 518;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 0, 0, 0);
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

        pnlCardFacil.setBackground(new java.awt.Color(28, 49, 102));
        pnlCardFacil.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(28, 49, 102));
        jPanel4.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel5.setBackground(new java.awt.Color(28, 49, 102));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lblJugadorFacil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJugadorFacil.setText("Jugador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel5.add(lblJugadorFacil, gridBagConstraints);

        lblIntentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIntentos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntentos.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel5.add(lblIntentos, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        pnlGridFacil.setBackground(new java.awt.Color(28, 49, 102));
        pnlGridFacil.setLayout(new java.awt.GridLayout(2, 5, 5, 5));
        jPanel4.add(pnlGridFacil, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(28, 49, 102));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        btnSalirFacil.setBackground(new java.awt.Color(61, 152, 226));
        btnSalirFacil.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirFacil.setText("Regresar");
        btnSalirFacil.setBorderColor(new java.awt.Color(29, 78, 136));
        btnSalirFacil.setColor(new java.awt.Color(61, 152, 226));
        btnSalirFacil.setColorClick(new java.awt.Color(159, 204, 240));
        btnSalirFacil.setColorOver(new java.awt.Color(20, 82, 132));
        btnSalirFacil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalirFacil.setRadius(20);
        btnSalirFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirFacilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel7.add(btnSalirFacil, gridBagConstraints);

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardFacil.add(jPanel4, gridBagConstraints);

        pnlCards.add(pnlCardFacil, "cardFacil");

        pnlCardMedio.setBackground(new java.awt.Color(28, 49, 102));
        pnlCardMedio.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(28, 49, 102));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel8.setBackground(new java.awt.Color(28, 49, 102));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        lblJugadorMedio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJugadorMedio.setText("Jugador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel8.add(lblJugadorMedio, gridBagConstraints);

        lblIntentosMedio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIntentosMedio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntentosMedio.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel8.add(lblIntentosMedio, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        pnlGridMedio.setBackground(new java.awt.Color(28, 49, 102));
        pnlGridMedio.setLayout(new java.awt.GridLayout(5, 6, 5, 5));
        jPanel6.add(pnlGridMedio, java.awt.BorderLayout.CENTER);

        jPanel19.setBackground(new java.awt.Color(28, 49, 102));
        jPanel19.setLayout(new java.awt.GridBagLayout());

        btnSalirMedio.setBackground(new java.awt.Color(61, 152, 226));
        btnSalirMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMedio.setText("Regresar");
        btnSalirMedio.setBorderColor(new java.awt.Color(29, 78, 136));
        btnSalirMedio.setColor(new java.awt.Color(61, 152, 226));
        btnSalirMedio.setColorClick(new java.awt.Color(159, 204, 240));
        btnSalirMedio.setColorOver(new java.awt.Color(20, 82, 132));
        btnSalirMedio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalirMedio.setRadius(20);
        btnSalirMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMedioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel19.add(btnSalirMedio, gridBagConstraints);

        jPanel6.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 50);
        pnlCardMedio.add(jPanel6, gridBagConstraints);

        pnlCards.add(pnlCardMedio, "cardMedio");

        pnlCardDificil.setBackground(new java.awt.Color(28, 49, 102));
        pnlCardDificil.setLayout(new java.awt.GridBagLayout());

        jPanel16.setBackground(new java.awt.Color(28, 49, 102));
        jPanel16.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel17.setBackground(new java.awt.Color(28, 49, 102));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        lblJugadorDificil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJugadorDificil.setText("Jugador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel17.add(lblJugadorDificil, gridBagConstraints);

        lblIntentosDificil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIntentosDificil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIntentosDificil.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel17.add(lblIntentosDificil, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        pnlGridDificil.setBackground(new java.awt.Color(28, 49, 102));
        pnlGridDificil.setLayout(new java.awt.GridLayout(5, 10, 5, 5));
        jPanel16.add(pnlGridDificil, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(28, 49, 102));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        btnSalirDificil.setBackground(new java.awt.Color(61, 152, 226));
        btnSalirDificil.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirDificil.setText("Regresar");
        btnSalirDificil.setBorderColor(new java.awt.Color(29, 78, 136));
        btnSalirDificil.setColor(new java.awt.Color(61, 152, 226));
        btnSalirDificil.setColorClick(new java.awt.Color(159, 204, 240));
        btnSalirDificil.setColorOver(new java.awt.Color(20, 82, 132));
        btnSalirDificil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalirDificil.setRadius(20);
        btnSalirDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDificilActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel9.add(btnSalirDificil, gridBagConstraints);

        jPanel16.add(jPanel9, java.awt.BorderLayout.PAGE_END);

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

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        obLogica.iniciarFacil();
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedioActionPerformed
        obLogica.iniciarMedio(lblJugadorMedio, lblIntentosMedio);
    }//GEN-LAST:event_btnMedioActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        obLogica.menuPrincipal();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        obLogica.iniciarDificil(lblJugadorDificil, lblIntentosDificil);
    }//GEN-LAST:event_btnDificilActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
        obLogica.iniciarJuegoAdivinanza();
    }//GEN-LAST:event_btnAdivinarActionPerformed

    private void btnSalirFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirFacilActionPerformed
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirFacilActionPerformed

    private void btnSalirMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMedioActionPerformed
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirMedioActionPerformed

    private void btnSalirDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDificilActionPerformed
        obLogica.seleccionarDificultad();
    }//GEN-LAST:event_btnSalirDificilActionPerformed

    private void btnComoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoJugarActionPerformed
        new GUI_ComoJugar().setVisible(true);
    }//GEN-LAST:event_btnComoJugarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnAdivinar;
    private button.MyButton btnComoJugar;
    private button.MyButton btnDificil;
    private button.MyButton btnFacil;
    private button.MyButton btnMedio;
    private button.MyButton btnMenuPrincipal;
    private button.MyButton btnSalir;
    private button.MyButton btnSalirDificil;
    private button.MyButton btnSalirFacil;
    private button.MyButton btnSalirMedio;
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
    private javax.swing.JPanel jPanel19;
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
