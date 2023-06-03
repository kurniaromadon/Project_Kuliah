
package Pertemuan7;

/**
 *
 * @author kurniaromadon
 */
import java.awt.GraphicsEnvironment;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Lat2_KurniaRomadon extends JFrame{
    public Lat2_KurniaRomadon(){
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        GraphicsEnvironment graphic;
        graphic = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] namaFont = graphic.getAvailableFontFamilyNames();
        
        String string = "";
        for (int x = 0; x < namaFont.length; x++) {
            string += namaFont[x];
            string += (x < namaFont.length - 1) ? "\n" : "";
}
        Font font = new Font("Tahoma", Font.BOLD + Font.ITALIC, 11);
        JTextArea area = new JTextArea();
        area.append(string);
        area.setFont(font);
        
        JScrollPane pane = new JScrollPane(area);
        container.add(pane, BorderLayout.CENTER);
    }
    
    // Metode Main
    public static void main (String[] args){
        Lat2_KurniaRomadon frame = new Lat2_KurniaRomadon();
        frame.setTitle("FontSystem - Kurnia Romadon");
        frame.setSize(450, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
