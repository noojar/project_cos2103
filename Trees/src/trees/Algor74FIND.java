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
public class Algor74FIND {
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
      
      static Node ROOT,LOC,SAVE,PAR,PTR;  //กำหนดตัวแปร ROOT
      static int ITEM;
      static Node STACT[]= new Node[10];
      
    public static void main(String args[]){
          //กำหนดข้อมูลแต่ละโนด
           A.INFOR = 20;
           B.INFOR = 10;
           C.INFOR = 30;
           D.INFOR = 8;
           E.INFOR = 15;
           F.INFOR = 12;
           G.INFOR = 25;
           H.INFOR = 40;
           J.INFOR = 35;
           K.INFOR = 50;
           L.INFOR = 31;
          //เชื่อมโยงการใช้งานตามรูปภาพที่ 7-6
          A.LEFT = B; A.RIGHT = C;
          B.LEFT = D; B.RIGHT = E;
          E.LEFT = F;
          C.LEFT = G; C.RIGHT = H;
          H.LEFT = J; H.RIGHT = K;
          J.LEFT = L;      
          ROOT=A;  // กำหนดค่า Root ชี้ไปยังโนด A
          ITEM=400;
          if(FIND()) System.out.println("ค้นพบ");
      }
  public static boolean FIND(){
    if(ROOT==null) {LOC=null; PAR=null;  return false; }
    if(ITEM==(int)ROOT.INFOR) {LOC=ROOT; PAR=null; return true; }
    if(ITEM<(int)ROOT.INFOR) {
       PTR=ROOT.LEFT;
       SAVE=ROOT;
    }else
    {
      PTR=ROOT.RIGHT;
      SAVE=ROOT;
    } //end if
    while(PTR !=null){
        if(ITEM==(int) PTR.INFOR) {
            LOC=PTR;
            PAR=SAVE;
            return true;
        }
        if(ITEM<(int)PTR.INFOR){
            SAVE=PTR;
            PTR=PTR.LEFT;
        }else
        {
           SAVE=PTR;
           PTR = PTR.RIGHT;
        }
    }//end while
    LOC=null; PAR=SAVE;
    return false;  
  } //end method
  
}
