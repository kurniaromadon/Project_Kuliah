
package Pertemuan4;

/**
 *
 * @author kurniaromadon
 */
import java.util.*;
public class Lat3_KurniaRomadon {
    public static void main(String[] args){
    
            //initializing a Dictionary
            Dictionary geek = new Hashtable();
            
            // put() Method
            geek.put("12", "Code");
            geek.put("34", "Program");
            geek.put("56", "Kurnia");
            geek.put("78", "Romadon");
            
            // elements () method
            for (Enumeration i = geek.elements(); i.hasMoreElements();){
            System.out.println("Value in Dictionary : " + i.nextElement());
            }
    System.out.println("\nValue at key = 6 : " + geek.get("6"));
    System.out.println("Value at key = 34 : " + geek.get("34"));
    System.out.println("Value at key = 56 : " + geek.get("56"));
    
    //IsEmpty() method
    System.out.println("\nThere is no key-value pair : " + geek.isEmpty() + "\n");
    
    //keys() method
    for (Enumeration k = geek.keys(); k.hasMoreElements();){
    System.out.println("Keys in Dictionary : " + k.nextElement());
    }
    
    //remove() method 
    System.out.println("\nRemove : " + geek.remove("12"));
    System.out.println("Check the value of removed key : " + geek.get("12"));
    System.out.println("\nSize of Dictionary : " + geek.size());
    }
}
