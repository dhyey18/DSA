class RotateArray {
    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5};
        int k = 3;

        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);


        for(int val : arr) {
            System.out.print(val);
        }

    }

    static void reverse(int arr[],int i,int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}