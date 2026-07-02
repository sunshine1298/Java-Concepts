/*
Program Name: MatrixAddition.java

Idea Used:
Add corresponding elements of two matrices using nested loops
and store the result in a third matrix.

Time Complexity: O(rows × cols)

Space Complexity: O(rows × cols)
(Result matrix is used to store the sum)
*/

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};

        int[][] b = {{5, 6}, {7, 8}};

        int rows = a.length;
        int col = a[0].length;

        int[][] c = new int[rows][col];

        if(a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrix addition not possible");
                return;
}


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
