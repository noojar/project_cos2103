/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaADT;
import java.util.LinkedList;
import java.util.Collections;
/**
 *
 * @author ComSCIv3400
 */
public class implLinkListsIns {
  public static void main(String args[]) {
      LinkedList<String> myList= new LinkedList();
      myList.add("test");
      myList.add("Nok");
      myList.add("kai");
      myList.add("Jat");
      Collections.sort(myList);
      System.out.println("Before Inserting:"+myList);      
      myList.add("Boy");
      myList.add("Zombies");
      Collections.sort(myList);
      System.out.println("Before Inserting:"+myList);      
  }  
    
}
