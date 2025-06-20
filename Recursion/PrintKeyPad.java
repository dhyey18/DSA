class PrintKeyPad {
    public static void main(String args[]) {

        String str = "79";

        getPKP(str,"");


    }

    static String[] strArr = {
        ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };


    public static void getPKP(String str,String op) {

        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        char ch = str.charAt(0);

        String newStr = str.substring(1);
        String code = strArr[ch - '0'];
        
        for(int i=0; i<code.length(); i++) {
            getPKP(newStr,op + code.charAt(i));
        }

    }
}