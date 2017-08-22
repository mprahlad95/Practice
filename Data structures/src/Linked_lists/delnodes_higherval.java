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
public class delnodes_higherval extends Template {
    
    public Node delnodes(Node head) {
        Node current = head;
        Node temp = head;
        Node prev = new Node();
        Node x = prev;
        int flag = 0, count = 0;
        while (current.next != null) {
            temp = current.next;
            flag = 0;
            while (temp != null) {
                if (current.data > temp.data) {
                    temp = temp.next;
                    flag = 0;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                prev.next = current.next;
            }
            if (flag == 0) {
                prev = prev.next;
                if (++count == 1) {
                    x = prev;
                }
            }
            current = current.next;
        }
        prev.next = current;
        return x;
    }
    
    public static void main(String[] args) {
        delnodes_higherval LL = new delnodes_higherval();
        LL.insert_end(12);
        LL.insert_end(15);
        LL.insert_end(10);
        LL.insert_end(11);
        LL.insert_end(5);
        LL.insert_end(6);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.traverse(head);
        Node deleted = LL.delnodes(head);
        LL.traverse(deleted);
    }
}
