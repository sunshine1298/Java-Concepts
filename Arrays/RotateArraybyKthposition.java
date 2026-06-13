/*
 * Program: Rotate Array by K Positions (Right Rotation)
 *
 * Idea Used:
 * Reverse the entire array, then reverse the first k elements,
 * and finally reverse the remaining n-k elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RotateArraybyKthposition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        int k = 1;

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n-1);

        reverse(nums, 0, k-1);

        reverse(nums, k, n-1);

        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    static void reverse (int[] nums, int s, int e) {
            while(s < e) {

                int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
            }
        }
}
