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
public class recursive_reverse extends Stack_int {
    
    public void reverse() {
        int z = 0;
        if (top >= 0) {
            z = peek();
            pop();
            reverse();
            push_bottom(z);
        }         
    }
    
    public void push_bottom(int x) {
        int y = 0;
        if (isEmpty()) {
            push(x);
        }
        else {
            y = peek();
            pop();
            push_bottom(x);
            push(y);
        }
    }
    
    public static void main (String[] args) {
        recursive_reverse s = new recursive_reverse();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.printstack();
        s.reverse();
        s.printstack();
    }
}
