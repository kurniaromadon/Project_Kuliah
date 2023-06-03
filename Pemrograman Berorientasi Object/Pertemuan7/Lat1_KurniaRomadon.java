
package Pertemuan7;

/**
 *
 * @author kurniaromadon
 */
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
public class Lat1_KurniaRomadon extends JFrame {
    public Lat1_KurniaRomadon(){
        super("Kelas DrawingRect - Kurnia Romadon");
        setSize(520, 165);
        setVisible(true);
    }
    
    //Metode Paint
    public void paint (Graphics g){
        super.paint(g);
        
        g.setColor(Color.RED);
        g.drawRect(20, 40, 480, 50);
        g.setColor(Color.ORANGE);
        g.fillRect(20, 100, 480, 50);
    }
    public static void main(String[] args){
        Lat1_KurniaRomadon frame = new Lat1_KurniaRomadon();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
