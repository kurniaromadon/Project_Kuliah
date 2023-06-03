
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class Lat7_KurniaRomadon {
    public static void main (String[] args) throws IOException {
    //Membuka File
    // Byte Stream -> FileInputStream
    // Karater Stream -> FileReader
    FileInputStream filebyte=new
    FileInputStream ("E:\\baca2.txt");
    FileReader filechar=new FileReader("E:\\baca2.txt");
    //Membaca File
    System.out.println(filebyte.read());
    System.out.println(filechar.read());
    System.out.println(filebyte.read());
    System.out.println(filechar.read());
    //Menutup File 
    filebyte.close () ;
    filechar.close () ;
}
}
