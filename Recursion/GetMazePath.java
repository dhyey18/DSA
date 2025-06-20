import java.util.ArrayList;
class GetMazePath {
    public static void main(String args []) {

        int maze[][] = {
            { 0, 0, 0, 0},
            { 0, 0, 0, 0},
            { 0, 0, 0, 0},
            { 0, 0, 0, 0}
        };

        int n = maze.length-1;
        int m = maze[0].length-1;

        ArrayList<String> result = getMazePath(maze,0,0,m,n);

        System.out.print(result);

    }

    public static ArrayList<String> getMazePath(int[][] maze,int sh ,int hv ,int eh ,int ev) {

        if(sh == eh && hv == ev) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        } else if(sh > eh || hv > ev) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        
        
        ArrayList<String> roh = getMazePath(maze,sh+1,hv,eh,ev);
        ArrayList<String> rov = getMazePath(maze,sh,hv+1,eh,ev);
        
        ArrayList<String> result = new ArrayList<>();

        for (String val : roh) {
            result.add('H' + " " +val);
        }

        for (String val : rov) {
            result.add('V'+ " " + val);
        }

        return result;

    }


}