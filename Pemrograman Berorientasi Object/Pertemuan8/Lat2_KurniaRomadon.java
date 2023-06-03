
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Lat2_KurniaRomadon {
   public static void main (String [] args) throws IOException {
   FileInputStream fileInput=new FileInputStream ("E:\\agit.txt");
   System.out.println((char)fileInput.read());
   System.out.println((char)fileInput.read());
   System.out.println((char)fileInput.read());
   System.out.println((char)fileInput.read());
   System.out.println((char)fileInput.read());
   System.out.println((char)fileInput.read());
}
}
