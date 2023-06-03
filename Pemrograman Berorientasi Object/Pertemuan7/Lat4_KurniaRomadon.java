
package Pertemuan7;

/**
 *
 * @author kurniaromadon
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Lat4_KurniaRomadon extends Applet implements MouseListener, MouseMotionListener{
    int width, height;
    int mx, my;
    boolean isButtonPressed = false;
    
    public void init() {
    width = getSize().width;
    height = getSize().height;
    setBackground( Color.black );
    mx = width/2;
    my = height/2;
    addMouseListener( this );
    addMouseMotionListener( this );
    }
    public void mouseEntered( MouseEvent e ) {
    
    }
    public void mouseExited( MouseEvent e ) {
    
    }
    public void mouseClicked( MouseEvent e ) {
    
    }
    public void mousePressed( MouseEvent e ) {
    isButtonPressed = true;
    setBackground( Color.gray );
    repaint();
    e.consume();
    }
    public void mouseReleased( MouseEvent e ) {
    isButtonPressed = false;
    setBackground( Color.black );
    repaint();
    e.consume();
    }
    public void mouseMoved( MouseEvent e ) {
    mx = e.getX();
    my = e.getY();
    showStatus( "Mouse at (" + mx + "," + my + ")" );
    repaint();
    e.consume();
    }
    public void mouseDragged( MouseEvent e ) { 
    mx = e.getX();
    my = e.getY();
    showStatus( "Mouse at (" + mx + "," + my + ")" );
    repaint();
    e.consume();
    }
    public void paint( Graphics g ) {
    if ( isButtonPressed ) {
    g.setColor( Color.black );
    }
    else {
    g.setColor( Color.gray );
    }
    g.fillRect( mx-20, my-20, 40, 40 );
    }
}

