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
public class Merge {
    static Node head;
    
    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
        
        Node() {
            
        }
    }
    
    public Node push(Node head, int d) {
        Node new_node = new Node(d);
        Node last = head;
        if (head == null) {
            head = new_node;
            last = head;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
            System.out.println(last.next);
        }
        return last;
    }
   
    public void traverse(Node start) {
        Node last = start;
        while (last != null) {
            //System.out.print("random crap");
            System.out.print(last.data + " ");
            last = last.next;
        }
    }
    
    public Node sortit(Node list1, Node list2) {
        Node finalList = new Node();
        while (list1 != null || list2 != null) {
              System.out.print(list1.data + " ");
              System.out.print(list2.data + " ");
            if (list1.data < list2.data) {
                finalList.data = list1.data;
                list1 = list1.next;
            }
            else {
                finalList.data = list2.data;
                list2 = list2.next;
            }
            finalList = finalList.next;
        }
        return finalList;
    }
    
    public static void main(String[] args) {
        Merge LL1 = new Merge();
        Node head1, head2;
        head1 = head2 = null;
        head1 = LL1.push(head1, 3);
        head1 = LL1.push(head1, 5);
        head1 = LL1.push(head1, 8);
        head1 = LL1.push(head1, 15);
        head2 = LL1.push(head2, 1);
        head2 = LL1.push(head2, 9);
        head2 = LL1.push(head2, 10);
        head2 = LL1.push(head2, 16);
//      Merge sortobj = new Merge();
//      Node sorted_node = sortobj.sortit(head1, head2);
        LL1.traverse(head1);
        LL1.traverse(head2);
    }
}
