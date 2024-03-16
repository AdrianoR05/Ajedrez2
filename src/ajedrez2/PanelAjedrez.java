
package ajedrez2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelAjedrez extends JPanel implements Runnable{
    public static final int ancho = 1100;
    public static final int alto = 600;
    final int fps = 60;
    Thread EjecutarThread;
    Tablero tablero = new Tablero();
    
    //Color
    public static final int blanco = 0;
    public static final int negro = 0;
    int colorActual = blanco;
    
    public PanelAjedrez() {
        setPreferredSize(new Dimension(ancho, alto));
        setBackground(Color.BLACK);
    }
    
    public void CorrerJuego() {
        EjecutarThread = new Thread(this);
        EjecutarThread.start();
        
    }
    
    @Override
    public void run() {
        //Bucle del juego
        double Intervalo = 1000000000/fps;
        double Delta = 0;
        long TiempoAnterior = System.nanoTime();
        long TiempoActual;
        while (EjecutarThread != null){
            TiempoActual = System.nanoTime();
            
            Delta += (TiempoActual - TiempoAnterior)/Intervalo; //No lo sobreescribe sino que lo añade.
            TiempoAnterior = TiempoActual;
            if (Delta >= 1){
                update();
                repaint();
                Delta--;
                
            }
        }
    }
    
    
    private void update() {
        
    }
    
    public void pintarComponente(Graphics a) {
        super.paintComponent(a);
        
        Graphics2D a2 = (Graphics2D)a;
        
        tablero.dibujar(a2);
    }
    
}
