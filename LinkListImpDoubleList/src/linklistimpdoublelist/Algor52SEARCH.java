/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklistimpdoublelist;

/**
 *
 * @author ComSCIv3400
 */
public class Algor52SEARCH {
        static DNode START, LAST;
        public static void main(String[] args) {
        DNode NodeA = new DNode(); NodeA.INFOR = 20;
        DNode NodeB = new DNode(); NodeB.INFOR = 30;
        DNode NodeC = new DNode(); NodeC.INFOR = 40;
        DNode NodeD = new DNode(); NodeD.INFOR = 50;
        DNode NodeE = new DNode(); NodeE.INFOR = 60;
        DNode NodeF = new DNode(); NodeF.INFOR = 70;
        DNode NodeG = new DNode(); NodeG.INFOR = 80;
        DNode NodeH = new DNode(); NodeH.INFOR = 90;
        DNode NodeI = new DNode(); NodeI.INFOR = 100;
        START = NodeA; 
        NodeA.FORW =NodeB; NodeB.BACK = NodeA;
        NodeB.FORW =NodeC; NodeC.BACK = NodeB;
        NodeC.FORW =NodeD; NodeD.BACK = NodeC;
        NodeD.FORW =NodeE; NodeE.BACK = NodeD;
        NodeE.FORW =NodeF; NodeF.BACK = NodeE;
        NodeF.FORW =NodeG; NodeG.BACK = NodeF;
        NodeG.FORW =NodeH; NodeH.BACK = NodeG;
        NodeH.FORW =NodeI; NodeI.BACK = NodeH;
        NodeI.FORW =null;  LAST = NodeH;
        //Search Data
        SEARCH(30);
        }
   public static void SEARCH(int ITEM){     
        //Algorrithm 5.2 SEARCH        
        DNode LOC=null;
        DNode PTR=null;
        PTR=START;
        while(PTR!=null){
          if(ITEM==(int)PTR.INFOR) {
              LOC = PTR;
              break;
          }else
            PTR=PTR.FORW;
        }
        //Show Result;
        if(LOC ==null) 
            System.out.println("Not found.");
        else
            System.out.println("Found.");
    }

}
