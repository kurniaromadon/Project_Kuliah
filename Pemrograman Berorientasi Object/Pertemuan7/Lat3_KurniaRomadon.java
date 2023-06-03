
package Pertemuan7;

/**
 *
 * @author kurniaromadon
 */

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Lat3_KurniaRomadon extends Applet {
    TextField t1= new TextField();
    TextField t2 = new TextField();
    TextField t3=new TextField();
    public Lat3_KurniaRomadon(){
    Label l1=new Label("Nomor Satu : ");
    Label l2=new Label("Nomor Dua : ");
    Label l3=new Label("Hasilnya Adalah : ");
    setLayout(new GridLayout(3,2));
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
}

}
