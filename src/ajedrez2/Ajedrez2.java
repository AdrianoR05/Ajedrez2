
package ajedrez2;

import javax.swing.JFrame;

public class Ajedrez2 {


    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ajedrez");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        //Agregar panel de juego a la ventana
        PanelAjedrez panel = new PanelAjedrez();
        ventana.add(panel);
        ventana.pack();
        
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
        panel.CorrerJuego();
    }
    
}
