import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumTwo {
    
    public static void main(String args[]) {

        int candidates[] = {1,1,1,2,2};
        int target = 4;

         Arrays.sort(candidates); // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), result);

    }

    public static void solve(int candidates[], int target, int start, List<Integer> options,  List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(options));
            return;
        }

        for(int i=start; i<candidates.length - 1; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break;

            options.add(candidates[i]);
            solve(candidates, target - candidates[i], i + 1, options, result);
            options.remove(options.size() - 1); 

        }

    }

}