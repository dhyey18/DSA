class NQueen {
    public static void main(String args[]) {

        int n = 4;
        
        int arr[][] = new int[n][n];

        placeNqueen(arr,0,"");

    }

    public static void placeNqueen(int chess[][], int row, String op) {

        if(row == chess.length) {
            System.out.println(op);
            return;
        }

        for(int col=0; col<chess.length; col++) {
            if(isQueenIsSafe(chess,row,col) == true) {
                chess[row][col] = 1;
                placeNqueen(chess,row + 1,op + " , " + row + " - " + col);
                chess[row][col] = 0;
            }
        }

    }

    public static boolean isQueenIsSafe(int[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }
}