// Traverse and display all elements of a 2D array (matrix)
// Uses nested loops to visit each row and column
// Time Complexity: O(rows × columns)
// Space Complexity: O(1)

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        System.out.println("Matrix Array: ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
