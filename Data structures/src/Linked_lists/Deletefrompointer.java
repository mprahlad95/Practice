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
public class Deletefrompointer extends Template {
    
    public void deletefromptr(Node ptr) {
        Node pointer = ptr.next;
        ptr.data = pointer.data;
        ptr.next = pointer.next;
    }
    
    public static void main (String[] args) {
        Template LL = new Template();
        Deletefrompointer LL1 = new Deletefrompointer();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        Node ptr = head.next.next.next;
        LL.traverse(head);
        LL1.deletefromptr(ptr);
        LL.traverse(head);
    }
}
