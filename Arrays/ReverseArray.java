// Reverse an array using the two-pointer technique
// Swaps elements from both ends while moving towards the center
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
