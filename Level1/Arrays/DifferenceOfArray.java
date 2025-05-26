class DifferenceOfArray {
    public static void main(String args[]) {

        int[] arr2 = {6,8,4,8};
        int[] arr1 = {9,8,9};

        int maxLength = arr1.length > arr2.length ? arr1.length : arr2.length;

        int[] ans = new int[maxLength];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;

        int borrow = 0;

        while(k >= 0) {
            
            int d = 0;
            int av1 =  i >= 0 ? arr1[i] : 0;

            if(arr2[j] + borrow  >= av1) {
                d = arr2[j] + borrow - av1;
                borrow = 0;
            } else {
                d = (borrow + 10 + arr2[j]) - av1;
                borrow = -1;
            }

            ans[k] = d;

            i--;
            j--;
            k--;
        }

        for (int o = 0; o < ans.length; o++) {
            int each = ans[o];
            
            System.out.print(each);
        }
    }
}