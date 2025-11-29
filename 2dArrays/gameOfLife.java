public class gameOfLife {
    private boolean isValidNeighbor(int x, int y, int[][] board) {
        return (x >= 0 && x < board.length && y >= 0 && y < board[0].length);
    }

    public void gameOfLife(int[][] board) {
        int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};  // 8 directions for neighbors
        int[] dy = {1, -1, 1, -1, 0, 0, 1, -1};

        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Apply rules using temporary markers
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

                // Rule 1 or 3: Live cell dies (under/over population)
                if (board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = -1; // mark as dead
                }

                // Rule 4: Dead cell becomes live (reproduction)
                if (board[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 2; // mark as live
                }
            }
        }

        // Step 2: Finalize the board state
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }
}
