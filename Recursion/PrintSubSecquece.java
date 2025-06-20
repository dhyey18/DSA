class PrintSubSecquece {
    public static void main(String args[]) {

        String str = "abc";

        getSubSecquence(str,"");


    }

    public static void getSubSecquence(String str,String op) {

        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        char ch = str.charAt(0);

        String newStr = str.substring(1);

        getSubSecquence(newStr,op+ch);
        getSubSecquence(newStr,op);

    }
}