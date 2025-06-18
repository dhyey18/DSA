import java.util.ArrayList;


class Printallsubsequencesofastring {
    public static void main(String args[]) {
        
        String str = "abc";

        ArrayList <String> arr = new ArrayList<>();

        arr = getSubSequence(str);

        System.out.print(arr);
    }

    public static ArrayList<String> getSubSequence(String str) {

        if(str.length() == 0) {
            ArrayList <String> result = new ArrayList<>();
            result.add(" ");
            return result;
        }

        char ch = str.charAt(0);
        String newStr = str.substring(1);


        ArrayList<String> result =  getSubSequence(newStr);

        ArrayList<String> resultArr = new ArrayList<>();

        for(String cha : result) {
            resultArr.add(ch + " " + cha);
        }
        
        for(String cha : result) {
            resultArr.add(" "+cha);
        }


        return resultArr;
    }

}