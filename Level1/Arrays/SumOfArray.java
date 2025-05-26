class SumOfArray {
    public static void main(String args[]) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,5,6,7,8};

        int maxLength = arr1.length > arr2.length ? arr1.length : arr2.length;

        int[] ans = new int[maxLength];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;

        System.out.println(i + " : " + j + " : " +k);

        int carry = 0;

        while(k >= 0) {
            int d = carry;
            
            if(i >= 0) {
                d += arr1[i];
            }

            if(j >= 0) {
                d += arr2[j];
            }
            
            
            carry = d / 10;
            d = d % 10;
            
            System.out.println(d);
            
            ans[k] = d;

            i--;
            j--;
            k--;
        }

        System.out.print(ans);
    }
}