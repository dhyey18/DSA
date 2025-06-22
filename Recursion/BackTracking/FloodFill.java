class FloodFill {
    public static void main(String args[]) {

        int arr[][] = {
            {0,1,0,0,0,0},
            {0,1,0,1,1,0},
            {0,0,0,0,0,0},
            {1,0,1,1,0,1},
            {1,0,1,1,0,1},
            {1,0,0,0,0,0}
        };

        boolean visited[][] = new boolean[arr.length][arr[0].length];

        floodFill(arr,0,0,"",visited);

    }

    public static void floodFill(int maze[][] , int row , int col , String op , boolean visited[][]) {

        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true) {
            return;
        }

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(op);
            return;
        }

        visited[row][col] = true;
        floodFill(maze,row - 1, col , op + "T" , visited);
        floodFill(maze,row, col - 1 , op + "L", visited);
        floodFill(maze,row + 1, col , op + "D", visited);
        floodFill(maze,row, col + 1, op + "R", visited);
        visited[row][col] = false;

    }
}