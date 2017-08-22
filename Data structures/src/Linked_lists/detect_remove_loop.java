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
public class detect_remove_loop extends Template {
    
    public Node remove_loop(Node head) {
        Node current = head;
        Node save = current;
        while (current != null) {
            current.visited = true;
            if (current.next.visited == true) {
                current.next = null;
                break;
            }
            current = current.next;
        }
        return save;
    }
    
    public static void main(String[] args) {
        detect_remove_loop LL = new detect_remove_loop();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.head.next.next.next.next.next = head.next;
//        LL.traverse(head);
        Node removed = LL.remove_loop(head);
        LL.traverse(removed);
    }
}
