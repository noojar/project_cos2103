/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaADT;

import java.util.LinkedList;
 
public class SimpleJavaLinkedListExample {
 
  public static void main(String[] args) {
       
    LinkedList myList = new LinkedList();
   
    //add elements to LinkedList
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);  
    System.out.println("LinkedList contains : " + myList);
    System.out.println(myList.getFirst());
    System.out.println(myList.peek());
  }
}
 