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
public class del_alternatenodes extends Template {
    
    public Node delalt(Node head) {
        Node current = head;
        while (current.next != null && current.next.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
        return head;
    }
    
        
    public static void main(String[] args) {
        del_alternatenodes LL = new del_alternatenodes();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.insert_end(6);
        LL.insert_end(7);
        Node removed = LL.delalt(head);
        LL.traverse(removed);
        
    }
}
