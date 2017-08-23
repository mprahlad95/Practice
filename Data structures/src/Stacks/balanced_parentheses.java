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
public class balanced_parentheses extends Stack_char {
    
    public boolean isBalanced(String expression) {
        char c = ' ', x = ' ';
        int i;
        for (i = 0; i < expression.length(); i++) {
            c = expression.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                push(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                x = pop();
                if (!(x == '[' && c == ']' || x == '(' && c == ')' || x == '{' && c == '}')) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        balanced_parentheses s = new balanced_parentheses();
        String expression = "{([])}";
        System.out.println(s.isBalanced(expression));
    }
    
}
