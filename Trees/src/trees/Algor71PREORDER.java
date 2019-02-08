/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trees;

/**
 *
 * @author ComSCIv3400
 */
public class Algor71PREORDER {
      static Node A = new Node(); 
      static Node B = new Node(); 
      static Node C = new Node(); 
      static Node D = new Node(); 
      static Node E = new Node(); 
      static Node F = new Node(); 
      static Node G = new Node(); 
      static Node H = new Node(); 
      static Node J = new Node(); 
      static Node K = new Node(); 
      static Node L = new Node(); 
      
      static Node ROOT;  //กำหนดตัวแปร ROOT
      static Node STACT[]= new Node[10];
      
   public static void main(String args[]){
      //กำหนดข้อมูลแต่ละโนด
       A.INFOR = "A";
       B.INFOR = "B";
       C.INFOR = "C";
       D.INFOR = "D";
       E.INFOR = "E";
       F.INFOR = "F";
       G.INFOR = "G";
       H.INFOR = "H";
       J.INFOR = "J";
       K.INFOR = "K";
       L.INFOR = "L";
      //เชื่อมโยงการใช้งานตามรูปภาพที่ 7-6
      A.LEFT = B; A.RIGHT = C;
      B.LEFT = D; B.RIGHT = E;
      E.LEFT = F;
      C.LEFT = G; C.RIGHT = H;
      H.LEFT = J; H.RIGHT = K;
      J.LEFT = L;      
      ROOT=A;  // กำหนดค่า Root ชี้ไปยังโนด A
      PREORDER(ROOT); //ส่งทรีเข้าไปเพื่อทำการท่อง
  }  
   
public static void PREORDER(Node root){
    int TOP=1;
    STACT[1]=null;
    Node PTR=root;
    while(PTR!=null){
        System.out.println(PTR.INFOR); //Apply PROCESS to INFOR[PTR]
        if(PTR.RIGHT != null){
            TOP++;
            STACT[TOP] = PTR.RIGHT;
        }
        if(PTR.LEFT != null){
            PTR = PTR.LEFT;
        }else
        {
            PTR = STACT[TOP];
            TOP--;
        } 
    }//end of while loop
}    
    
}
