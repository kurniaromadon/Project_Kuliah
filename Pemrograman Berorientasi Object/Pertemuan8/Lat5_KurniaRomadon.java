
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */
import java.io.FileInputStream;
import java.io.IOException;
public class Lat5_KurniaRomadon {
    public static void main(String[] args) throws IOException{
    // membuka file
    FileInputStream fileInput = new FileInputStream ("E:\\agit.txt");
    // membaca file
    int data = fileInput.read () ;
    while (data != -1){
    System.out.println(data);
    data = fileInput.read () ;
    }
    // menutup file
    fileInput.close();
    }
}
