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
public class recursive_reverse extends Template{
    
    public void rec_reverse(Node head) {
        Node current = head;
        if (current == null) return;
        rec_reverse(current.next);
        System.out.print(head.data + " ");
    }
    
    public static void main(String[] args) {
        recursive_reverse LL = new recursive_reverse();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);        
        LL.rec_reverse(head);
    }
}
