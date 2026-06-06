public class Transpose {

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