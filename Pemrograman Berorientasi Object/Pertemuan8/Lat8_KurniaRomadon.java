
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */
import java.io.*;
public class Lat8_KurniaRomadon {
    public static void main (String[] args) throws IOException {
    // Membuka File
    //Byte Stream -> FileInputStream
    //Karater Stream -> FileReader
    FileInputStream fileInputbyte=new
    FileInputStream ("E:\\baca2.txt");
    FileReader fileInputchar=new
    FileReader ("E:\\baca2.txt");
    FileOutputStream fileOutputbyte=new
    FileOutputStream ("E:\\paste2.txt");
    FileWriter fileOutputchar=new
    FileWriter ("E:\\paste2.txt");
    //Membaca File byte stream 
    int data= fileInputbyte.read () ;
    while(data!=-1){
    System.out.println ((char) data);
    fileOutputbyte.write (data);
    data=fileInputbyte.read();
    }
    System.out.println ("\n");
    //Membaca File byte char 
    data= fileInputchar.read () ;
    while (data!=-1){
    System.out.println ((char) data);
    fileOutputchar.write (data);
    data=fileInputchar.read () ;
    }
    //Menutup File 
    fileInputbyte.close (); 
    fileInputchar.close ();
    fileOutputbyte.close ();
    fileOutputchar.close ();
}
    }
    