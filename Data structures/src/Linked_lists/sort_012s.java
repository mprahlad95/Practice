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
public class sort_012s extends Template {
    
    public Node sortit(Node head) {
        Node current = head;
        int count[] = {0, 0, 0};
        while (current != null) {
            count[current.data]++;
            current = current.next;
            }
        current = head;
        int i = 0;
        while (current != null) {
            if (count[i] == 0) {
                i++;
            }
            current.data = i;
            count[i]--;
            current = current.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        sort_012s LL = new sort_012s();
        LL.traverse(head);
        LL.insert_end(2);
        LL.insert_end(0);
        LL.insert_end(1);
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(0);
        LL.insert_end(1);
        LL.insert_end(1);
        LL.insert_end(0);
        LL.insert_end(2);
        Node sorted = LL.sortit(head);
        LL.traverse(sorted);
    }
    
}
