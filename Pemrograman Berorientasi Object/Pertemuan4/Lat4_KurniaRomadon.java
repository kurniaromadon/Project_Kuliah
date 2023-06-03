
package Pertemuan4;

/**
 *
 * @author kurniaromadon
 */
import java.util.*;
public class Lat4_KurniaRomadon {
    public static void main(String [] args){
        
        // ceating an empty Hashtable
        Hashtable<Integer, String>hash_table = new Hashtable<Integer, String>();
        
        //Mapping string values to int keys
        hash_table.put(10, "Belajar");
        hash_table.put(20, "Coding");
        hash_table.put(30, "Mudah");
        hash_table.put(40, "Bukan?");
        hash_table.put(50, "Bukan");
        
        //Displaying the HashMap
        System.out.println("Initial Table is : " + hash_table);
        
        //Checking for the Value 'Belajar'
        System.out.println("Is the Value 'Belajar' present?)" + hash_table.contains("Belajar"));
        
        //Checking for the Value 'Susah'
        System.out.println("Is the Value 'Susah' present?)" + hash_table.contains("Susah"));
    }
    
}
