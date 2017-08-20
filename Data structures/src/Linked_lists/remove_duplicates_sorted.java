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
public class remove_duplicates_sorted extends Template {
    
    public Node remove(Node first) {
        Node start = first;
        Node next = null;
        while(start.next != null) {
             next = start.next;
            if (start.data == start.next.data) {
                start.next = start.next.next;
            }
            else start = start.next;
        }
        return first;
    }
    
    public static void main(String[] args) {
        remove_duplicates_sorted LL = new remove_duplicates_sorted();
        Node first;
        LL.insert_end(1);
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(7);
        LL.insert_end(7);
        LL.insert_end(11);
        LL.insert_end(15);
        LL.insert_end(15);
        LL.insert_end(17);
        Node removed = LL.remove(head);
        LL.traverse(removed);
    }
}
