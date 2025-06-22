class PrintPermutationWithLetterCaseChange {
    public static void main(String args[]) {
        String str = "a1b2";

        printPermutationWithLetterCaseChange(str,"");
    }

    public static void printPermutationWithLetterCaseChange(String str, String op) {

        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        char ch = str.charAt(0);

        String newStr = str.substring(1);

        if(Character.isDigit(ch)) {
            printPermutationWithLetterCaseChange(newStr,op + ch);
        } else {
            printPermutationWithLetterCaseChange(newStr,op + Character.toUpperCase(ch));
            printPermutationWithLetterCaseChange(newStr,op + Character.toLowerCase(ch));
        }
        
    }
}