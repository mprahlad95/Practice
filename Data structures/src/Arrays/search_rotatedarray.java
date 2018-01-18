/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class search_rotatedarray {
    
    int arr[] = {5, 6, 7, 8, 1, 2, 3};
    
    public int search(int key) {
        int pos = 0;
        pivot_search();
        int pos_b = binary_search();
        return pos_b;
    }
    
    public void pivot_search() {
        int min = 0, max = arr.length - 1;
        
    }
    
    public int binary_search() {
        int pos = 0;
        
        return pos;
    }
    
    public static void main(String[] args){ 
        search_rotatedarray s = new search_rotatedarray();
        int key = 3;
        int pos = s.search(key);
        System.out.println("Key found at index " + pos);
    }
}
