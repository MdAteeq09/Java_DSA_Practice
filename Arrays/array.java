import java.util.*;

public class array {
    public static void main(String[] args) {
        int row = 2; int column = 3;
        int [][] matrix = {{2,3,7} , {5,7,6} };

        PrintMatrix(matrix);

        int [][] transpose = new int[column][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                transpose [j][i] = matrix[i][j];
            }
        } 

        PrintMatrix(transpose);
 
    }

    public static void PrintMatrix(int [][] matrix) {
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}



