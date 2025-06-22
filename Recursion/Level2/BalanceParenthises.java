class BalanceParenthises {
    public static void main(String args[]) {
        int n = 3;

        //               (   )
        printParentheses(n-1,n,"(");

    }

    public static void printParentheses(int open , int close , String op) {

        if(open == 0 && close == 0) {
            System.out.println(op);
            return;
        }

        if(open == close) {
            printParentheses(open - 1,close,op+"(");
        } else {
            if(open > 0) {
                printParentheses(open - 1,close,op+"(");
            }
            if(close > 0) {
                printParentheses(open,close - 1,op+")");
            }
        }

    }
}