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
public class rotate_reverse {
    
    public void rotate(int arr[], int n) {
        int i = 0;
        for (i = 0; i < n; i++) {
            rotateone(arr);
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public void rotateone(int arr[]) {
      int i, temp = arr[0];
      
      for (i = 0; i < arr.length - 1; i++){
          arr[i] = arr[i+1];
      }
      arr[i] = temp;
    }
    
    public static void main(String[] args) {
        rotate_reverse s = new rotate_reverse();
        int n = 2;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        s.rotate(arr, n);
    }
}
