import java.util.*;

public class infixExpressionEveluation {
    public static int getMaximumCount(int[] arr, int target) {
        int n = arr.length;
        
        // Count initial occurrences of target
        int baseCount = 0;
        for (int val : arr) {
            if (val == target) baseCount++;
        }
        
        int maxCount = baseCount;
        
        // Try each possible transformation value x
        Map<Integer, List<Integer>> transformMap = new HashMap<>();
        
        // Group indices by their transformation value (x = target - arr[i])
        for (int i = 0; i < n; i++) {
            if (arr[i] != target) {
                int x = target - arr[i];
                transformMap.computeIfAbsent(x, k -> new ArrayList<>()).add(i);
            }
        }
        
        // For each transformation value, use sliding window to find optimal subarray
        for (int x : transformMap.keySet()) {
            List<Integer> positions = transformMap.get(x);
            
            // Sliding window on positions that can be transformed with same x
            for (int i = 0; i < positions.size(); i++) {
                for (int j = i; j < positions.size(); j++) {
                    int leftPos = positions.get(i);
                    int rightPos = positions.get(j);
                    
                    // Count targets that would be lost in range [leftPos, rightPos]
                    int targetsLost = 0;
                    for (int k = leftPos; k <= rightPos; k++) {
                        if (arr[k] == target) {
                            targetsLost++;
                        }
                    }
                    
                    // Elements gained by transformation
                    int elementsGained = j - i + 1;
                    
                    // Total count = original targets - lost targets + gained elements
                    int totalCount = baseCount - targetsLost + elementsGained;
                    maxCount = Math.max(maxCount, totalCount);
                }
            }
        }
        
        return maxCount;
    }
    
    public static void main(String[] args) {
        int[] arr = {6, 4, 4, 6, 4, 4};
        int target = 6;
        System.out.println(getMaximumCount(arr, target)); // Expected: 5
        
        // Additional test cases
        int[] test1 = {1, 2, 3, 4, 5};
        System.out.println(getMaximumCount(test1, 3)); // Expected: 5
        
        int[] test2 = {5, 5, 5, 5};
        System.out.println(getMaximumCount(test2, 5)); // Expected: 4
    }
}

