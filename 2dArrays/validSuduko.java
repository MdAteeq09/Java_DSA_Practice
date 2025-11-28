import java.util.HashSet;

public class validSuduko {
    public static boolean isValidSudoku(char[][] board) {
        // 9 sets for rows, cols, boxes
        int n = 9;

        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                char cell = board[r][c];

                if (cell == '.') {
                    continue;
                }

                
                // row check
                if (rows[r].contains(cell)) {
                    return false;
                }

                rows[r].add(cell);

                if (cols[c].contains(cell)) {
                    return false;
                }

                cols[c].add(cell);

                int boxIdx = 3 * (r / 3) + (c / 3);

                if (boxes[boxIdx].contains(cell)) {
                    return false;
                }

                boxes[boxIdx].add(cell);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
}
