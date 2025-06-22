class PrintNBitBinaryNumber {
    public static void main(String args[]) {
        int n = 3;

        //                     1  0   n
        printNBitBinaryNumber(n-1,n,n-1,"1");

    }

    public static void printNBitBinaryNumber(int one ,int zero ,int n, String op) {

        if(n == 0) {
            System.out.println(op);
            return;
        }

        if(op.charAt(op.length() - 1) == '0') {
            printNBitBinaryNumber(one+1,zero,n-1,op+"1");
        } else {
            printNBitBinaryNumber(one+1,zero,n-1,op+"1");
            printNBitBinaryNumber(one,zero+1,n-1,op+"0");
        }

    }
}