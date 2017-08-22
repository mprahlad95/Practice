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
public class segregate_evenodd extends Template {
    
    public Node segregate(Node head) {
        Node temp = head;
        Node store_even = new Node();
        Node store_odd = new Node();
        Node temp_even = new Node();
        Node temp_odd = new Node();
        int count1 = 0, count2 = 0;
            while (temp != null) {
                if (temp.data % 2 == 0) {
                    store_even.next = temp;
                    store_even = store_even.next;
                    if (++count1 == 1) {
                        temp_even = store_even;
                    }
                } else {
                    store_odd.next = temp;
                    store_odd = store_odd.next;
                    if (++count2 == 1) {
                        temp_odd = store_odd;
                    }
                }
                temp = temp.next;
            }
        store_even.next = temp_odd;
        store_odd.next = null;
        return temp_even;
    }
    
    public static void main(String[] args) {
        segregate_evenodd LL = new segregate_evenodd();
        LL.insert_end(17);
        LL.insert_end(15);
        LL.insert_end(8);
        LL.insert_end(12);
        LL.insert_end(10);
        LL.insert_end(5);
        LL.insert_end(4);
        LL.insert_end(1);
        LL.insert_end(7);
        LL.insert_end(6);
        LL.traverse(head);
        Node segregated = LL.segregate(head);
        LL.traverse(segregated);
    }
}
