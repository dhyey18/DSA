class PalindromicPartitions {
    
    public static void main(String args[]) {

        String str = "abc";

    }

    public static void getSubString(String str,String op) {

        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        char ch = str.charAt(0);

        String newStr = str.substring(1);

        getSubString(newStr,op+ch);
        getSubString(newStr,op);

    }

}