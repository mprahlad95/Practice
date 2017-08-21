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
public class reverse_test extends Template {
    
    
    public Node reverse() {
        Node current = head;
        Node prev = null;
        Node temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        reverse_test LL = new reverse_test();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.traverse(head);
        Node x = LL.reverse();
        LL.traverse(x);
        
    }
    
}
