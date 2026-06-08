// Count the frequency of each element in an array
// Uses nested loops and a visited check to avoid duplicate counting
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class FrequencyofElement {
    public static void main(String[] args) {
        //frequency counting
        int[] arr = {1, 2, 7, 1, 2, 4};

        for(int i = 0; i < arr.length; i++) {
            int ch = arr[i];
            int count = 1;
            boolean visited = false ;


            for (int k =0; k < i; k++) {
                if(arr[k] == ch) {
                    visited = true;
                    break;
                }
            }

            if(visited) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] == ch) count++;
            }

            System.out.println(ch + "-> " + count);
        }
    }
}
