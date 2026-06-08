// Find the second largest element in an array
// Traverses the array once while tracking the largest and second largest values
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}