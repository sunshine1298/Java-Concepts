// Merge two arrays and store the result in a third array
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)


public class MergeArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6, 9, 6};

        int[] merge = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
             merge[i] = a1[i];
        }

        for (int i = 0; i < a2.length; i++) {
            merge[a1.length + i] = a2[i];
        }

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
        System.out.println();    
    }
}
