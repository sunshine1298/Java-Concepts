// Find the transpose of a matrix by swapping rows and columns
// The element at position [i][j] becomes [j][i] in the transposed matrix
// Time Complexity: O(rows × columns)
// Space Complexity: O(rows × columns)

public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] rev = new int[col][row];


        for(int i = 0; i < rev.length; i++) {
            for(int j = 0; j < rev[0].length; j++) {
                rev[j][i] = matrix[i][j];
            }
        }
    return rev;
}

        
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        transpose(matrix);

    }
} 