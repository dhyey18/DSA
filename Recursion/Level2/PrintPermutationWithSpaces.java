class PrintPermutationWithSpaces {
    public static void main(String args[]) {
        String str = "abc";

        char firstCh = str.charAt(0);
        printWithSpaces(str.substring(1),firstCh+"");
    }

    public static void printWithSpaces(String str, String op) {

        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        char ch = str.charAt(0);

        String newStr = str.substring(1);

        printWithSpaces(newStr,op + "_" + ch);
        printWithSpaces(newStr,op + ch);
        

    }
}