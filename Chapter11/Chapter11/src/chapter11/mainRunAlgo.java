/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter11;

/**
 *
 * @author PC
 */
public class mainRunAlgo {
    public static void main(String args[]) {
        Comparable  myArr[] ={12,3,4,5,6,7,8,9};
        
        
//         InsertionSort al = new InsertionSort();
//        long t1 = System.nanoTime();
//        System.out.println("Time:"+t1);
//       // al.insertionSort(myArr, myArr.length);
//        System.out.println("Time process:"+(System.nanoTime()-t1));
//        for(int i=0; i<myArr.length; i++)
//          System.out.println("Data:"+myArr[i]);
        
//          BubbleSort.bubbleSort(myArr, myArr.length);
//         InsertionSort al = new InsertionSort();
        SelectionSort al = new SelectionSort();
        al.selectionSort(myArr, myArr.length);
          for(int i=0; i<myArr.length; i++)
          System.out.println("Data:"+myArr[i]);
    }
       
    
}
