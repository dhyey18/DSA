import java.util.ArrayList;
import java.util.HashSet;



class TargetSumAll {

    static HashSet<String> seen = new HashSet<String>();

    public static void main(String args[]) {
        
        int arr[] = {2,5,2,1,2};

        ArrayList<Integer> options = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        combinationSum(arr,8,0,0,options,result);

        System.out.print(result);
    }

    public static void combinationSum(int arr[] , int target, int index, int total, ArrayList<Integer> options,
    ArrayList<ArrayList<Integer>> result) {

        if(total == target) {
            String str = options.toString();
            if(!seen.contains(str)) {
                seen.add(str);
                result.add(new ArrayList<>(options));
            }
            return;
        }

        if(total > target || index >= arr.length) {
            return;
        }

        options.add(arr[index]);
        combinationSum(arr,target,index + 1,total+arr[index],options, result);
        options.remove(options.size()-1);

        combinationSum(arr,target,index + 1,total, options,result );

    }
    

}