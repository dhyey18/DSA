class TotalMAxOne {

    public static int[] rowAndMaximumOnes(int[][] mat) {

        int maxValue = 0;
        int totalN = mat[0].length;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {

            int firstIndex = firstOccurance(mat[i], 1);
            int totalOne = totalN - firstIndex;
            
            
            if (totalOne > maxValue) {
                maxValue = totalOne;
                index = i;
            }

        }

        System.out.print(index + "  " + maxValue);

        return new int[]{index, maxValue};
    
    }

    public static int firstOccurance(int arr[], int val) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] <= val) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;

    }

    public static void main(String args[]) {
        int arr[][] = {{
            0,1
        },{1,1}};

        // System.out.print(

            
            rowAndMaximumOnes(arr);
        //     );
    }
}