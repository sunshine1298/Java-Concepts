// Find the missing number in an array containing numbers from 1 to n
// Uses the sum formula to calculate the expected sum and compares it with the actual sum
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4};

// brute force approach
        // for(int num = 0; num < arr.length; num++) {
        //     boolean found = false;

        //     for(int j = 0; j < arr.length; j++) {
        //         if(arr[j] == num) {
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found) {
        //         System.out.println(num);
        //     }
        // }

        int n = arr.length;

        int expectedSum = n *(n+1)/2;

        int actualSum = 0;

        for(int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missingNum = expectedSum - actualSum;

        System.out.println("The missing number in the array is " + missingNum);
    }
}
