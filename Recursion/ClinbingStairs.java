import java.util.ArrayList;

class ClinbingStairs {
    public static void main(String args[]) {
        
        int stairs = 4;

        ArrayList<String> result = getStairsPath(stairs);

        System.out.print(result);

    }

    public static ArrayList<String> getStairsPath(int stairs) {

        if(stairs == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add(""); 
            return result;
        } else if(stairs < 0) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }

        ArrayList<String> arr1 = getStairsPath(stairs-1);
        ArrayList<String> arr2 = getStairsPath(stairs-2);
        ArrayList<String> arr3 = getStairsPath(stairs-3);
        
        ArrayList<String> result = new ArrayList<>();

        for (String each : arr1) {
            result.add("1" + each);
        }

        for (String each : arr2) {
            result.add("2" + each);
        }

        for (String each : arr3) {
            result.add("3" + each);
        }

        return result;
    }
}