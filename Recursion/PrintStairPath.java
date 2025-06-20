class PrintStairPath {
    public static void main(String args[]) {

        int stairs = 4;

        ptintStairsPath(stairs,"");

    }


    public static void ptintStairsPath(int stairs,String op) {

        if(stairs == 0) {
            System.out.println(op);
            return;
        } else if(stairs < 0) {
            return;
        }

        for(int i=1; i<=3; i++) {
            ptintStairsPath(stairs-i,op+i);
        }

    }
}