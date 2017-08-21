/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_lists;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class alternate_split extends Template {
    
    static Node second;
    
    public void split(Node head) {
        Node current = head;
        second = head.next;
        Node temp = new Node();
        while (current.next != null && current.next.next != null) {
            temp = current.next;
            current.next = current.next.next;
            current = current.next;
            temp.next = current.next;
        }
        current.next = null;
    }
    
    
    public static void main(String[] args) {
        alternate_split LL = new alternate_split();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.insert_end(6);
        LL.insert_end(7);
        LL.insert_end(8);
        LL.insert_end(9);        
        LL.traverse(head);
        LL.split(head);
        LL.traverse(head);
        LL.traverse(second);
    }
}
