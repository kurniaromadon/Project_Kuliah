
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Lat6_KurniaRomadon {
    public static void main (String[] args) throws IOException {
    FileInputStream fileInput=null;
    FileOutputStream fileOutput=null;
    //Contoh Copy dan Tulis pada File 
    try{
    //Membuka File
    fileInput=new FileInputStream ("E:\\copy.txt"); 
    fileOutput=new FileOutputStream ("E:\\paste.txt");
    //Membaca File
    int data2=fileInput.read();
    //Menulis file 
    //fileOutput.write(data2);
    while (data2!=-1) {
    fileOutput.write(data2); 
    data2=fileInput.read();
    }
    }
    finally{
        if (fileInput!=null){
            fileInput.close () ;
        }
        if (fileOutput !=null){
            fileOutput.close();
        }
}
    }
}
