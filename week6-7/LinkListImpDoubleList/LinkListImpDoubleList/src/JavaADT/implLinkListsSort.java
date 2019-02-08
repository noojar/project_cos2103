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
public class implLinkListsSort {
  public static void main(String args[]) {
      LinkedList<String> myList= new LinkedList();
      myList.add("test");
      myList.add("Nok");
      myList.add("kai");
      myList.add("Jat");
      System.out.println("Before Sorting:"+myList);
      Collections.sort(myList);
      System.out.println("After Sorting:"+myList);
  }  
    
}
