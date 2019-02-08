/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaADT;
import java.util.TreeMap;
/**
 *
 * @author ComSCIv3400
 */
public class useTreeMap {
  public static void main(String args[]){
      TreeMap a = new TreeMap();
      a.put(1, "aaa");
      a.put(2, "bbb");
      a.put(3, "ccc");
      a.put(4, "ddd");
      a.put(5, "eee");      
      System.out.println(a);
      System.out.println(a.values());
      System.out.println(a.get(4));      
  }  
    
    
}
