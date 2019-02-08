/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//from http://stackoverflow.com/questions/8876406/binarytree-implementation-in-java
package Advances.BinaryTree;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author ComSCIv3400
 */
class Node
{
    Integer data;
    Node left;
    Node right;
    Node()
    {
        data = null;
        left = null;
        right = null;
    }
}
class BinaryTree
{
    Node head;
    Scanner input = new Scanner(System.in);
    BinaryTree()
    {
        head = null;
    }
    public void createNode(Node temp, Integer value) 
    {
        Node newnode= new Node();
        value = getData();
        newnode.data = value;
        temp = newnode;
        if(head==null)
        {
            head = temp;
        }
        System.out.println("If left child exits for ("+value+") enter y else n");
        if(input.next().charAt(0)=='y')
                   {
            createNode(temp.left, value);
        }
        System.out.println("If right child exits for ("+value+") enter y else n");
        if(input.next().charAt(0)=='y')
        {
            createNode(temp.right, value);
        }       
    }
    public Integer getData()
    {
        System.out.println("Enter the value to insert:");
        return (Integer)input.nextInt();
    }

    public void print()
    {
        inorder(head);
    }
    public void inorder(Node node)
               {
        if(node!=null)
        {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
        else
            return;
    }
}
class BinaryTreeWorker
{
    static BinaryTree treeObj = null;
    static Scanner input = new Scanner(System.in);
    public static void displaymenu()
    {
        int choice;
        do{
            out.print("\n Basic operations on a tree:");
            out.print("\n 1. Create tree  \n 2. Insert \n 3. Search value \n 4. print list\n Else. Exit \n Choice:");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    treeObj = createBTree();
                    break;
                case 2:
                    treeObj.createNode(null, null);
                    break;
                case 3:
                    //searchnode();
                    break;
                                    case 4:
                    treeObj.print();
                    break;
                default:
                    return;
            }       
        }while(true);
    }
    public static BinaryTree createBTree()
    {
        return new BinaryTree();
    }
    public static void main(String[] args)
    {
        displaymenu();
    }
}

