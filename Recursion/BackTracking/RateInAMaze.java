class RateInAMaze {
    public static void main(String args[]) {
        int maze[][] = {
            {0, 0, 0, 1},
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0},
        };

        int n = maze.length;
        int m = maze[0].length;

        boolean visited[][] = new boolean[n][m];

        solveRateInMazePath(maze, 0, 0, n, m, visited, "");
    }

    public static void solveRateInMazePath(int[][] maze, int row, int col, int n, int m, boolean[][] visited, String path) {
        // Boundary + blocked cell + already visited check
        if (row < 0 || col < 0 || row >= n || col >= m || maze[row][col] == 1 || visited[row][col]) {
            return;
        }

        // Destination reached
        if (row == n - 1 && col == m - 1) {
            System.out.println(path);
            return;
        }

        visited[row][col] = true;

        // Move Down
        solveRateInMazePath(maze, row + 1, col, n, m, visited, path + "D");
        // Move Right
        solveRateInMazePath(maze, row, col + 1, n, m, visited, path + "R");
        // Move Left
        solveRateInMazePath(maze, row, col - 1, n, m, visited, path + "L");
        // Move Up
        solveRateInMazePath(maze, row - 1, col, n, m, visited, path + "U");

        visited[row][col] = false; // backtrack
    }
}
    