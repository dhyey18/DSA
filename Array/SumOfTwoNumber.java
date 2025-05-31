class SumOfTwoNumber {
    public static void main(String args[]) {
        
        int arr1[] = {1,1};
        int arr2[] = {9,9,9};
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr2.length - 1;

        int ans[] = new int[k+1];

        int c = 0;

        while(k>=0) {

            int sum = c;

            if(i >= 0) {
                sum += arr1[i];
            }

            if(j >= 0) {
                sum += arr2[j];
            }

            c = sum / 10;
            sum = sum % 10;

            ans[k] = sum;



            i--;
            j--;
            k--;
        }

        if(c != 0) {
            System.out.print(c);
        }

        for(int val:ans) {
            System.out.print(val);
        }
    }
}