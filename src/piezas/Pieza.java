
package piezas;

import ajedrez2.Tablero;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Pieza {
    public BufferedImage imagen;
    public int x, y;
    public int col, fil, preCol, preFil;
    public int color;
    
    public Pieza(int color, int col, int fil){
        this.color = color;
        this.col = col;
        this.fil = fil;
        x = getX(col);
        y = getY(fil);
        preCol = col;
        preFil = fil;
    }

    public BufferedImage getImagen(String PathImagen) {
        BufferedImage imagen = null;
        try{
            imagen = ImageIO.read(getClass().getResourceAsStream(PathImagen + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }
    
    
    public int getX(int col){
        return col * Tablero.tamano_cuadro;
    }
    
    public int getY(int fil){
        return fil * Tablero.tamano_cuadro;
    }
}
