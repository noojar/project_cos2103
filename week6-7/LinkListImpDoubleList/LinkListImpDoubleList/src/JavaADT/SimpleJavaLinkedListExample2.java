/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaADT;

import java.util.LinkedList;
import java.util.Collections;
 
public class SimpleJavaLinkedListExample2 {
 
  public static void main(String[] args) {
       
    LinkedList myList = new LinkedList();      
    myList.add(4);
    myList.add(2);
    myList.add(9);
    myList.add(1);
    myList.add(5);  
    System.out.println(myList);
    Collections.sort(myList);
    System.out.println(myList);
    
  }
}
 