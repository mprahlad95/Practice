/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_lists;

import java.util.Scanner;

/**
 *
 * @author Mahe
 */
public class Menu_driven {
    
    static Node head;
        
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    //Insert at the front
    public void insert_front(int d) {
       Node new_node = new Node(d);
       new_node.next = head;
       head = new_node;
    }
    
    //Insert at the end
    public void insert_end(int d) {
            Node new_node = new Node(d);
            if (head == null) {
                head = new_node;
            }
            else {
                new_node.next = null;
                Node last = head;
                while (last.next != null)
                    last = last.next;
                    last.next = new_node;
            }
    }
    
    public void delete(int value) {
        Node last = head;
        Node prev = null;
        while (last.next != null) {
            prev = last;
            last = last.next;
            if (last.data == value) {
            prev.next = last.next;
            return;
            }
        }
    }
    
    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void traverse() {
        Node b = head;
        while (b != null) {
            System.out.print(b.data+" ");
            b = b.next;
        }
        System.out.println();
    }
    
    public static void main (String[] args) {
        //Create instances
        Scanner sc = new Scanner(System.in);
        Menu_driven ll = new Menu_driven();
        while(true) {
        System.out.println("0 - Insert at front" + "\t1 - Insert at rear" + "\t2 - Delete" + "\t3 - Traverse" + "\t4 - Reverse");
        int input = sc.nextInt();
        int value;
        switch (input)
        {
            case 0 :
                value = sc.nextInt();
                ll.insert_front(value);
                break;
            case 1 :
                value = sc.nextInt();
                ll.insert_end(value);
                break;
            case 2 : 
                System.out.println("Input the value to be deleted");
                value = sc.nextInt();
                ll.delete(value);
                break;
            case 3 :
                ll.traverse();
                break;
            case 4 :
                head = ll.reverse(head);
                break;
        }
    }
}
}
    

