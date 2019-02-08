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
public class Algor516INSTWL {
      static DNode START;
  static DNode LAST;

  public static void main(String[] args) {              
        DNode NodeA = new DNode(); NodeA.INFOR = 10;
        DNode NodeB = new DNode(); NodeB.INFOR = 20;
        DNode NodeC = new DNode(); NodeC.INFOR = 30;
        DNode NodeD = new DNode(); NodeD.INFOR = 40;
        DNode NodeE = new DNode(); NodeE.INFOR = 50;
        DNode NodeF = new DNode(); NodeF.INFOR = 35; //New Node to be inserted.
        START = NodeA; 
        NodeA.FORW =NodeB; NodeB.BACK = NodeA;
        NodeB.FORW =NodeC; NodeC.BACK = NodeB;
        NodeC.FORW =NodeD; NodeD.BACK = NodeC;
        NodeD.FORW =NodeE; NodeE.BACK = NodeD;
        NodeE.FORW =null; LAST=NodeE;
        System.out.println("Before Inserting:");
        ForwardTraversingList();
        INSTWL(NodeC,NodeD, NodeF);
        System.out.println("After Inserting:");
        ForwardTraversingList();
        }
    //end main
  
    public static void INSTWL(DNode LOCA,DNode LOCB, DNode NEW){      
       LOCA.FORW = NEW; NEW.FORW = LOCB;
       LOCB.BACK = NEW; NEW.BACK = LOCA;       
    }
    
    public static void ForwardTraversingList(){      
        DNode PTR=null;
        PTR=START;
        while(PTR!=null){
            System.out.println(PTR.INFOR);  //Apply PROCESS to INFOR[PTR]
            PTR=PTR.FORW;
        }
    }

    
}
