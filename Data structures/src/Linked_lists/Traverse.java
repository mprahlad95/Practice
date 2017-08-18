/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_lists;

/**
 *
 * @author Mahe
 */
public class Traverse {

   Node head;
   
   static class Node {
    int data;
    Node next;
    Node (int d) {
        data = d;
        next = null;
    }
   }
   private void printlist() {
       Node n = head;
       while ( n!= null) {
           System.out.print(n.data+ " ");
           n = n.next;
   }
   }
    public static void main(String[] args) {
        
        Traverse llist = new Traverse();
        llist.head = new Node(0);
        Node second = new Node(1);
        Node third = new Node(2);
        
        llist.head.next = second;
        second.next = third;
        
        llist.printlist();
    }
    
}
