import java.util.ArrayList;

class GetMazePathJump {
    public static void main(String args []) {

        int maze[][] = {
            { 0, 0, 0},
            { 0, 0, 0},
            { 0, 0, 0},
            // { 0, 0, 0, 0}
        };

        int n = maze.length-1;
        int m = maze[0].length-1;

        ArrayList<String> result = getMazePathJump(maze,0,0,m,n);

        System.out.print(result);

    }

    public static ArrayList<String> getMazePathJump(int[][] maze,int sh ,int hv ,int eh ,int ev) {

        if(sh == eh && hv == ev) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        } else if(sh > eh || hv > ev) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        
        ArrayList<String> result = new ArrayList<>();
        
        
        for(int i=1; i<=eh; i++) {
            ArrayList<String> roh = getMazePathJump(maze,sh+i,hv,eh,ev);
            for (String val : roh) {
                result.add('H' + " " +val);
            }
        }
        
        for(int i=1; i<=ev; i++) {
            ArrayList<String> rov = getMazePathJump(maze,sh,hv+i,eh,ev);
            for (String val : rov) {
                result.add('V'+ " " + val);
            }
        }
        
        for(int i=1; i<=ev && i<= eh; i++) {
            ArrayList<String> rod = getMazePathJump(maze,sh+i,hv+i,eh,ev);
            for (String val : rod) {
                result.add('D'+ " " + val);
            }
        }

        return result;

    }


}