import java.util.ArrayList;

class KeypadCombination {
    public static void main(String args[]) {

        String str = "467";

        ArrayList<String> result = getKeyPad(str);

        System.out.print(result);

    }

    static String[] strArr = {
        ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };

    public static ArrayList<String> getKeyPad(String str) {

        if(str.length() == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        
        char ch = str.charAt(0);
        String newStr = str.substring(1);
        
        ArrayList<String> resc =  getKeyPad(newStr);
        
        ArrayList<String> result = new ArrayList<>();

        String keyPadValue = strArr[ch - '0'];

        for(int i=0; i<keyPadValue.length(); i++) {

            char rval = keyPadValue.charAt(i);

            for(int j=0; j<resc.size(); j++) {
                result.add(rval + resc.get(j));
            }

        }

        return result;
        
    }
}