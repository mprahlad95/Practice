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
public class merge_sort extends Template{
    
    public void sortit(Node head) {
        Node current = head;
        Node mid = getmid(head);
        while (current != mid) {
            
        }
        
    }
    
    public Node getmid(Node x) {
        Node slow = x;
        Node fast = x;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            }
        }
        return slow;
    }
    
    public static void main(String[] args) {
        merge_sort LL = new merge_sort();
        LL.insert_end(15);
        LL.insert_end(10);
        LL.insert_end(5);
        LL.insert_end(20);
        LL.insert_end(3);
        LL.insert_end(2);
        LL.insert_end(21);
        LL.insert_end(4);
        LL.insert_end(11);
        LL.insert_end(9);
        LL.insert_end(17);
        LL.sortit(head);
        LL.traverse(head);
    }
}
