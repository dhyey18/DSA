class PrintPermutationWithCaseChange {
    public static void main(String args[]) {
        String str = "ab";

        printPermutationWithCaseChange(str,"");
    }

    public static void printPermutationWithCaseChange(String str, String op) {

        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        char ch = str.charAt(0);

        String newStr = str.substring(1);

        printPermutationWithCaseChange(newStr,op + Character.toUpperCase(ch));
        printPermutationWithCaseChange(newStr,op + ch);
        
    }
}