
package Pertemuan8;

/**
 *
 * @author kurniaromadon
 */

import java.io.*;
public class Lat1_KurniaRomadon {
    FileInputStream fin;
    boolean eof;
    public Lat1_KurniaRomadon(){
        File e=new File ("E:\\agit.TXT");
        if (e.exists () && e.isFile ()) {
            System. out.println ("OK");
        }
        else{
            System. out.println ("File Not Found");
            System.exit (-1);
        }
        try {
            fin=new FileInputStream (e) ;
            eof=false;
            int count=0;
            while (!eof) {
                int input=fin.read ();
                        if (input==-1)
                        eof=true;
                        else count++;
            }
            fin.close() ;
            System.out.println ("Jumlah bytes: "+count);
            }
        catch (IOException ioe) {
                System.out.println ("Ada Kesalahan");
        }
    }
    public static void main(String[] args){
        new Lat1_KurniaRomadon();
}


}
