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
public class move_LtoF extends Template {
    
    public Node move(Node head) {
        Node curr = head;
        Node prev = new Node();
        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        Node newdata = new Node(curr.data);
        prev.next = null;
        newdata.next = head;
        head = newdata;
        return head;
    }
    
    public static void main(String[] args) {
        move_LtoF LL = new move_LtoF();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.insert_end(6);
        Node moved = LL.move(head);
        LL.traverse(moved);
    }
}
