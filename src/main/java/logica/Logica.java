package logica;

import button.MyButton;
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

    private JPanel pnlGridFacil, pnlGridMedio, pnlGridDificil, pnlCards;
    private JLabel lblIntentos, lblJugadorFacil, lblSuerteJugador;
    private JTextField txtNombre;
    private CardLayout cardLayout;
    private String nombre;

    public Logica(JPanel pnlGridFacil, JPanel pnlGridMedio, JPanel pnlGridDificil, JPanel pnlCards, JLabel lblIntentos, JLabel lblJugadorFacil, JLabel lblSuerteJugador,
            CardLayout cardLayout, String nombre, JTextField txtNombre) {
        this.pnlGridFacil = pnlGridFacil;
        this.pnlGridMedio = pnlGridMedio;
        this.pnlGridDificil = pnlGridDificil;
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
                MyButton boton = (MyButton) comp;

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
                            boton.setColor(new Color(255, 51, 51));
                            boton.setColorOver(new Color(255, 51, 51));
                            boton.setColorClick(new Color(255, 51, 51));
                            boton.setText("X");
                            boton.setEnabled(false);
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
        int contador = 1;
        lblIntentos.setText("Intentos: " + intentos);

        for (Component comp : pnlGridFacil.getComponents()) {
            MyButton boton = (MyButton) comp;
            boton.setColor(new Color(88, 24, 69));
            boton.setColorOver(new Color(135, 37, 106));
            boton.setColorClick(new Color(78, 25, 63));
            boton.setText(String.valueOf(contador));
            boton.setEnabled(true);
            contador++;
        }
    }

    public void iniciarMedio(JLabel lblJugadorMedio, JLabel lblIntentosMedio) {
        reiniciarMedio(lblIntentosMedio);
        cardLayout.show(pnlCards, "cardMedio");
        lblJugadorMedio.setText("Jugador: " + nombre);
        
        // Asegurarse de que cada botón solo tenga un ActionListener
        for (Component comp : pnlGridMedio.getComponents()) {
            if (comp instanceof JButton) {
                MyButton boton = (MyButton) comp;

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
                            boton.setColor(new Color(255, 51, 51));
                            boton.setColorOver(new Color(255, 51, 51));
                            boton.setColorClick(new Color(255, 51, 51));
                            boton.setText("X");
                            boton.setEnabled(false);
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
        int contador = 1;
        lblIntentosMedio.setText("Intentos: " + intentos);

        for (Component comp : pnlGridMedio.getComponents()) {
            MyButton boton = (MyButton) comp;
            boton.setColor(new Color(88, 24, 69));
            boton.setColorOver(new Color(135, 37, 106));
            boton.setColorClick(new Color(78, 25, 63));
            boton.setText(String.valueOf(contador));
            boton.setEnabled(true);
            contador++;
        }
    }
    
    public void iniciarDificil(JLabel lblJugadorDificil, JLabel lblIntentosDificil) {
        reiniciarDificil(lblIntentosDificil);
        cardLayout.show(pnlCards, "cardDificil");
        lblJugadorDificil.setText("Jugador: " + nombre);
        
        // Asegurarse de que cada botón solo tenga un ActionListener
        for (Component comp : pnlGridDificil.getComponents()) {
            if (comp instanceof JButton) {
                MyButton boton = (MyButton) comp;

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
                        lblIntentosDificil.setText("Intentos: " + intentos);
                        if (numeroSeleccionado == numeroSecreto) {
                            int opcion = JOptionPane.showConfirmDialog(null, "¡Correcto! Adivinaste el número en " + intentos + " intentos.\n"
                                    + "¿Quieres jugar de nuevo?", "Haz ganado!!", JOptionPane.YES_NO_OPTION);
                            if (JOptionPane.YES_OPTION == opcion) {
                                reiniciarDificil(lblIntentosDificil);
                            } else {
                                cardLayout.show(pnlCards, "cardDificultad");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrecto. Intenta de nuevo.");
                            boton.setColor(new Color(255, 51, 51));
                            boton.setColorOver(new Color(255, 51, 51));
                            boton.setColorClick(new Color(255, 51, 51));
                            boton.setText("X");
                            boton.setEnabled(false);
                        }
                    }
                });
            }
        }
    }
    
    private void reiniciarDificil(JLabel lblIntentosDificil){
        Random random = new Random();
        numeroSecreto = random.nextInt(50) + 1;
        intentos = 0;
        int contador = 1;
        lblIntentosDificil.setText("Intentos: " + intentos);

        for (Component comp : pnlGridDificil.getComponents()) {
            MyButton boton = (MyButton) comp;
            boton.setColor(new Color(88, 24, 69));
            boton.setColorOver(new Color(135, 37, 106));
            boton.setColorClick(new Color(78, 25, 63));
            boton.setText(String.valueOf(contador));
            boton.setEnabled(true);
            contador++;
        }
    }
    
    public void seleccionarDificultad(){
        cardLayout.show(pnlCards, "cardDificultad");
    }
    
    public void menuPrincipal(){
        cardLayout.show(pnlCards, "cardInicio");
    }
}
