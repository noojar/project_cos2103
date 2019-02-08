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
public class TestSelectionSortNew {
    
    public static void main(String args[]){
        int data[] = {1,45, 70, 63, 99};
        selectionSort(data);
        for(int i=0;i<data.length;i++)
            System.out.println(data[i]);
    }
    
    public static void selectionSort(int[] a) {
    for (int i = 0; i < a.length; i++) {
        // find index of smallest element
        int minIndex = i; int temp=a[i];
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[minIndex]) {
                minIndex = j;
            }
        }

        // swap smallest element with a[i]
        //int temp = a[i]swap(a, i, minIndex);
        a[i]=a[minIndex];
        a[minIndex] = temp;
    }
    
    
}

}
