/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos2103_week7linklist;

/**
 *
 * @author PC
 */
public class CreateDataListFirst1 {
    
    public static void main(String args[]){
        Node START;
        Node NodeA = new Node();
        NodeA.INFOR = 50;
        Node NodeB = new Node();
        NodeB.INFOR = 12;
        Node NodeC = new Node();
        NodeC.INFOR = 56;
        START= NodeA;
        NodeA.LINK = NodeB; 
        NodeB.LINK=NodeC; 
        TraverseLink(START);
    }
    
 public static void TraverseLink(Node START){
     Node PTR=null;
        PTR=START;
        while(PTR!=null){
            System.out.println(PTR.INFOR);  //Apply PROCESS to INFOR[PTR]
            PTR=PTR.LINK;
        }
 }     
    
    
}
