class PrintMazePathWithJump {
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

        for(int i=1; i<=he; i++) {
            ptintStairsPath(maze,hs+i,vs,he,ve,op+" h "+i);
        }

        for(int i=1; i<=ve; i++) {
            ptintStairsPath(maze,hs,vs+i,he,ve,op+" v "+i);
        }

        for(int i=1; i<=ve && i<=he; i++) {
            ptintStairsPath(maze,hs+i,vs+i,he,ve,op+" d "+i);
        }

    }
}