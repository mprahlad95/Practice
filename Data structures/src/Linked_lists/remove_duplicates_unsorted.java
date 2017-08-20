/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_lists;

import java.util.HashSet;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class remove_duplicates_unsorted extends Template {
    
    public Node remove_dup(Node head) {
        Node prev, curr;
        curr = head;
        prev = null;
        int curr_val;
        HashSet <Integer> hs = new HashSet();
        while(curr != null) {
            curr_val = curr.data;
            if (hs.contains(curr_val)) {
                prev.next = curr.next;
            }
            else {
                hs.add(curr_val);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        remove_duplicates_unsorted LL = new remove_duplicates_unsorted();
        LL.insert_end(11);
        LL.insert_end(11);
        LL.insert_end(3);
        LL.insert_end(2);
        LL.insert_end(9);
        LL.insert_end(2);
        LL.insert_end(9);
        LL.insert_end(9);
        LL.insert_end(11);
        LL.insert_end(1);
        LL.traverse(head);
        Node removed = LL.remove_dup(head);
        LL.traverse(head);
        
    }
    
}
