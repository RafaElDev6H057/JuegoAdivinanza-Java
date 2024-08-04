package logica;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Logica {

    private int intentos = 0;
    private int numeroSecreto = 0;

    private JPanel pnlGridFacil, pnlGridMedio, pnlCards;
    private JLabel lblIntentos, lblJugadorFacil, lblSuerteJugador;
    private JTextField txtNombre;
    private CardLayout cardLayout;
    private String nombre;

    public Logica(JPanel pnlGridFacil, JPanel pnlGridMedio, JPanel pnlCards, JLabel lblIntentos, JLabel lblJugadorFacil, JLabel lblSuerteJugador,
            CardLayout cardLayout, String nombre, JTextField txtNombre) {
        this.pnlGridFacil = pnlGridFacil;
        this.pnlGridMedio = pnlGridMedio;
        this.pnlCards = pnlCards;
        this.lblIntentos = lblIntentos;
        this.lblJugadorFacil = lblJugadorFacil;
        this.lblSuerteJugador = lblSuerteJugador;
        this.cardLayout = cardLayout;
        this.nombre = nombre;
        this.txtNombre = txtNombre;
    }

    public void iniciarJuegoAdivinanza() {
        nombre = txtNombre.getText();
        lblSuerteJugador.setText("Mucha Suerte " + nombre);
        cardLayout.show(pnlCards, "cardDificultad");
    }

    public void iniciarFacil() {
        reiniciarFacil();
        cardLayout.show(pnlCards, "cardFacil");
        lblJugadorFacil.setText("Jugador: " + nombre);

        // Asegurarse de que cada botón solo tenga un ActionListener
        for (Component comp : pnlGridFacil.getComponents()) {
            if (comp instanceof JButton) {
                JButton boton = (JButton) comp;

                // Quitar todos los ActionListeners existentes
                for (ActionListener al : boton.getActionListeners()) {
                    boton.removeActionListener(al);
                }

                // Agregar el nuevo ActionListener
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numeroSeleccionado = Integer.parseInt(e.getActionCommand());
                        System.out.println("NUMERO SELECCIONADO: " + numeroSeleccionado);
                        System.out.println("NUMERO ALEATORIO: " + numeroSecreto);
                        intentos++;
                        lblIntentos.setText("Intentos: " + intentos);
                        if (numeroSeleccionado == numeroSecreto) {
                            int opcion = JOptionPane.showConfirmDialog(null, "¡Correcto! Adivinaste el número en " + intentos + " intentos.\n"
                                    + "¿Quieres jugar de nuevo?", "Haz ganado!!", JOptionPane.YES_NO_OPTION);
                            if (JOptionPane.YES_OPTION == opcion) {
                                reiniciarFacil();
                            } else {
                                cardLayout.show(pnlCards, "cardDificultad");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrecto. Intenta de nuevo.");
                            boton.setBackground(Color.red);
                        }
                    }
                });
            }
        }
    }

    private void reiniciarFacil() {
        Random random = new Random();
        numeroSecreto = random.nextInt(10) + 1;
        intentos = 0;
        lblIntentos.setText("Intentos: " + intentos);

        for (Component comp : pnlGridFacil.getComponents()) {
            comp.setBackground(Color.WHITE);
        }
    }

    public void iniciarMedio(JLabel lblJugadorMedio, JLabel lblIntentosMedio) {
        reiniciarMedio(lblIntentosMedio);
        cardLayout.show(pnlCards, "cardMedio");
        lblJugadorMedio.setText("Jugador: " + nombre);
        
        // Asegurarse de que cada botón solo tenga un ActionListener
        for (Component comp : pnlGridMedio.getComponents()) {
            if (comp instanceof JButton) {
                JButton boton = (JButton) comp;

                // Quitar todos los ActionListeners existentes
                for (ActionListener al : boton.getActionListeners()) {
                    boton.removeActionListener(al);
                }

                // Agregar el nuevo ActionListener
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numeroSeleccionado = Integer.parseInt(e.getActionCommand());
                        System.out.println("NUMERO SELECCIONADO: " + numeroSeleccionado);
                        System.out.println("NUMERO ALEATORIO: " + numeroSecreto);
                        intentos++;
                        lblIntentosMedio.setText("Intentos: " + intentos);
                        if (numeroSeleccionado == numeroSecreto) {
                            int opcion = JOptionPane.showConfirmDialog(null, "¡Correcto! Adivinaste el número en " + intentos + " intentos.\n"
                                    + "¿Quieres jugar de nuevo?", "Haz ganado!!", JOptionPane.YES_NO_OPTION);
                            if (JOptionPane.YES_OPTION == opcion) {
                                reiniciarMedio(lblIntentosMedio);
                            } else {
                                cardLayout.show(pnlCards, "cardDificultad");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrecto. Intenta de nuevo.");
                            boton.setBackground(Color.red);
                        }
                    }
                });
            }
        }
    }
    
    private void reiniciarMedio(JLabel lblIntentosMedio){
        Random random = new Random();
        numeroSecreto = random.nextInt(30) + 1;
        intentos = 0;
        lblIntentosMedio.setText("Intentos: " + intentos);

        for (Component comp : pnlGridMedio.getComponents()) {
            comp.setBackground(Color.WHITE);
        }
    }
    
    public void seleccionarDificultad(){
        cardLayout.show(pnlCards, "cardDificultad");
    }
    
    public void menuPrincipal(){
        cardLayout.show(pnlCards, "cardInicio");
    }
}
