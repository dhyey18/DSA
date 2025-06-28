class PrintPermutation {
    public static void main(String args[]) {

        String str = "abc";

        printPermutation(str,"");

    }


    public static void printPermutation(String str ,String op) {

        if(str.length() == 0) {
            System.out.print(op+ " ");
        }

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            String newStr = str.substring(0,i) + str.substring(i+1);

            printPermutation(newStr,op+ch);

        }

    }
} 