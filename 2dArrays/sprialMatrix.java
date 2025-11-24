import java.util.ArrayList;
import java.util.List;

public class sprialMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();//ll

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            //right
            for(int i=startRow+1; i<=endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                result.add(matrix[endRow][j]);
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                 if(startCol == endCol) {
                    break;
                }
                result.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(arr));
    }
}
