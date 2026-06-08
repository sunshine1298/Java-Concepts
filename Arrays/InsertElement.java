// Insert an element at a specific position in an array
// Creates a new array and shifts elements to accommodate the new value
// Time Complexity: O(n)
// Space Complexity: O(n)

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        int element = 3;
        int position = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = element;

        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}