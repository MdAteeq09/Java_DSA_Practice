import java.util.Arrays;

public class setMatrixZero {
    public static void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;

        // Step 1: Set markers in first row and first column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstRow = true;
                    if (j == 0)
                        firstCol = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Step 2: Replace inner matrix based on markers
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (firstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        
    }
    public static void main(String[] args) {
        int matrix [][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println("Before:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nAfter:");
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {                 // row loop
            for (int j = 0; j < matrix[0].length; j++) {          
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
