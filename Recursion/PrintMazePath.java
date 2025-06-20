class PrintMazePath {
    public static void main(String args[]) {

        int maze[][] = {
            { 0, 0, 0, 0},
            { 0, 0, 0, 0},
            { 0, 0, 0, 0},
            { 0, 0, 0, 0}
        };

        int n = maze.length-1;
        int m = maze[0].length-1;

        ptintStairsPath(maze,0,0,m,n,"");

    }


    public static void ptintStairsPath(int[][] maze, int hs, int vs, int he, int ve, String op) {

        if(hs == he && vs == ve) {
            System.out.print(op+" , ");
            op = "";
            return;
        } else if(hs > he || vs > ve) {
            return;
        }

        ptintStairsPath(maze,hs+1,vs,he,ve,op+" h");
        ptintStairsPath(maze,hs,vs+1,he,ve,op+" v");

    }
}