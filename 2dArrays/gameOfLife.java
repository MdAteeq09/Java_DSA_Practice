import java.util.Arrays;

public class gameOfLife {

    private boolean isValidNeighbor(int x, int y, int[][] board) {
        return (x >= 0 && x < board.length && y >= 0 && y < board[0].length);
    }

    public void gameOfLife(int[][] board) {
        int[] dx = {0, 0, 1, 1, 1, -1, -1, -1}; 
        int[] dy = {1, -1, 1, -1, 0, 0, 1, -1};

        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Apply rules with temporary markers
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int liveNeighbors = 0;

                for (int i = 0; i < 8; i++) {
                    int currX = row + dx[i];
                    int currY = col + dy[i];

                    if (isValidNeighbor(currX, currY, board) && Math.abs(board[currX][currY]) == 1) {
                        liveNeighbors++;
                    }
                }

                if (board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = -1;  
                }

                if (board[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 2;   
                }
            }
        }

        // Step 2: Finalize states
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] > 0) board[row][col] = 1;
                else board[row][col] = 0;
            }
        }
    }


    public static void main(String[] args) {
        gameOfLife obj = new gameOfLife();

        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        System.out.println("Before:");
        printBoard(board);

        obj.gameOfLife(board);

        System.out.println("\nAfter:");
        printBoard(board);
    }

    //
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
