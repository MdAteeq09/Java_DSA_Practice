import java.util.*;
public class matrixDiagonalSum {
     public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += mat[i][i];
            sum += mat[i][n-1-i];
        }

        if(n%2 == 1) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [][] = new int[size][size];
        
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(diagonalSum(arr));// func call
    }
}
