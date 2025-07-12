import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


class TargetSumSubsetTwo {
    
    static HashSet<String> set = new HashSet<>();
    
    public static void main(String args[]) {

        int arr[] = {1,2,2};

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> options = new ArrayList<>();

        printTargetSumSubset(arr,0,result,options);

        System.out.print(result);
    }

    public static void printTargetSumSubset(int arr[] ,int index,List<List<Integer>> result,List<Integer> options) {


        if(index == arr.length) {
            String strOptions = options.toString();
            if(!set.contains(strOptions)) {
                set.add(strOptions);
                result.add(new ArrayList<>(options));
            }
            return;
        }


        options.add(arr[index]);
        printTargetSumSubset(arr,index + 1,result,options);
        options.remove(options.size() - 1);

        printTargetSumSubset(arr,index + 1,result,options);
        
    }

}