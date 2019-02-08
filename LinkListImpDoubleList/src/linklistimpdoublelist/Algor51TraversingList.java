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
public class Algor51TraversingList {
  static DNode START;
  static DNode LAST;
  public static void main(String[] args) {              
        DNode NodeA = new DNode(); NodeA.INFOR = 10;
        DNode NodeB = new DNode(); NodeB.INFOR = 20;
        DNode NodeC = new DNode(); NodeC.INFOR = 30;
        DNode NodeD = new DNode(); NodeD.INFOR = 40;
        DNode NodeE = new DNode(); NodeE.INFOR = 50;
        START = NodeA; 
        NodeA.FORW =NodeB; NodeB.BACK = NodeA;
        NodeB.FORW =NodeC; NodeC.BACK = NodeB;
        NodeC.FORW =NodeD; NodeD.BACK = NodeC;
        NodeD.FORW =NodeE; NodeE.BACK = NodeD;
        NodeE.FORW =null; LAST=NodeE;
        System.out.println("Forward Traversing:");
        ForwardTraversingList();  
        System.out.println("Backward Traversing:");
        BackwardTraversingList();
        }
    //end main 
  
  public static void ForwardTraversingList(){      
        DNode PTR=null;
        PTR=START;
        while(PTR!=null){
            System.out.println(PTR.INFOR);  //Apply PROCESS to INFOR[PTR]
            PTR=PTR.FORW;
        }
    }
public static void BackwardTraversingList(){      
        DNode PTR=null;
        PTR=LAST;
        while(PTR!=null){
            System.out.println(PTR.INFOR);  //Apply PROCESS to INFOR[PTR]
            PTR=PTR.BACK;
        }
    }
}
