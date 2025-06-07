
class ReverseAnArray  {
    
    

    public static int[] reverseArray (int arr[] , int i , int j) {

        while(i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }

        return arr;
    }

    public static void rotate(int[] nums, int k) {
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
        reverseArray(nums,0,nums.length-1);
    }

    public static void main(String args[]) {
        
        int arr[] = {-1,-100,3,99};
        int k = 2;
    
        rotate(arr, k);

        for (int each : arr) {
            System.out.print(each + " "); 
        }

    }
}