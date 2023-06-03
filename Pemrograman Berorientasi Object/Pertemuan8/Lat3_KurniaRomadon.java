
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */
import java.io.FileInputStream;
import java.io.IOException;
public class Lat3_KurniaRomadon {
   public static void main (String[] args) throws IOException {
    //membaca file
   FileInputStream fileInput = new FileInputStream ("E:\\agit.txt");
    //membuka File
   int data = fileInput.read();
   while (data != -1) {
   System.out.println((char)data);
   data = fileInput.read () ;
   }
   //Menutup File
   fileInput.close();
   }
}
