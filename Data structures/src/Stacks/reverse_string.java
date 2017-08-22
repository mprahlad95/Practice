/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class reverse_string {
    
    static int max = 100;
    char a[] = new char[max];
    static int top;
    
    reverse_string() {
        top = -1;
    }
    
    public void insert(String name) {
        int i;
        if (top > max - 1) {
            return;
        }
        for (i = 0; i < name.length(); i++) {
            a[++top] = name.charAt(i);
        }
    }
        
    public void reverse() {
        while (top >= 0) {
            System.out.print(a[top--]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String name = "Prahlad";
        System.out.println(name);
        reverse_string s = new reverse_string();
        s.insert(name);
        s.reverse();
    }
}
