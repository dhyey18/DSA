class KnightTour {
    public static void main(String args[]) {

        int n = 5;
        
        int arr[][] = new int[n][n];


        // Initialize all cells to -1 to represent unvisited
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = -1;

        knightTour(arr,0,0,1);

    }

    public static void knightTour(int chess[][], int row, int col, int moves) {

        if(row < 0 || col < 0 || row >= chess.length || col >= chess[0].length || chess[row][col] != -1) {
            return;
        } else if(moves == chess.length * chess[0].length) {
            chess[row][col] = moves;
            for(int i=0; i<chess.length; i++) {
                for(int j=0; j<chess[0].length; j++) {
                    System.out.print(chess[i][j] + " , ");
                }
            }
            System.out.println();
            return;
        }

        chess[row][col] = moves;

        knightTour(chess,row-2,col+1,moves+1);
        knightTour(chess,row-1,col+2,moves+1);
        knightTour(chess,row+1,col+2,moves+1);
        knightTour(chess,row+2,col+1,moves+1);
        knightTour(chess,row+2,col-1,moves+1);
        knightTour(chess,row+1,col-2,moves+1);
        knightTour(chess,row-1,col-2,moves+1);
        knightTour(chess,row-2,col-1,moves+1);

        chess[row][col] = -1;

    }
}