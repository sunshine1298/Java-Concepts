// Check whether an array is sorted in ascending order
// Compares each element with its next element
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class CheckSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enetr the element of the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
            
            if(sorted) { 
                System.out.println("Array is sorted.");
            } else {
                System.out.println("Array is not sorted.");
            }  
        sc.close();      
    }
}
