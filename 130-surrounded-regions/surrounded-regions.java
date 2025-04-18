
class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        if (m == 0) return;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            possibleConnections(board, i, 0);
            possibleConnections(board, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            possibleConnections(board, 0, j);
            possibleConnections(board, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void possibleConnections(char[][] board, int i, int j) {
        int m = board.length, n = board[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') return;

        board[i][j] = 'A';

        possibleConnections(board, i + 1, j);
        possibleConnections(board, i - 1, j);
        possibleConnections(board, i, j + 1);
        possibleConnections(board, i, j - 1);
    }
}

