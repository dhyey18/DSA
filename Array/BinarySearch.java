
class BinarySearch  {

    public static void main(String args[]) {
        
        int nums[] = {1,2,4,6,8,10,12};
        int target = 10;

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;


        int i=0;
        int j=nums.length-1;

        while(i <= j) {

            int mid = (i + j) / 2;

            if(target > nums[mid]) {
                i = mid+1;
                min = nums[mid];
            } else if(target < nums[mid]) {
                j = mid-1;
                max = nums[mid];
            } else {
                min=max=nums[mid];
                break;
            }

        }

        System.out.print(min + " " + max);
    }

    // public static void search(int[] nums, int target) {
        
    //     int i=0;
    //     int j=nums.length-1;

    //     while(i <= j) {

    //         int mid = (i + j) / 2;

    //         if(target > nums[mid]) {
    //             i = mid+1;
    //         } else if(target < nums[mid]) {
    //             j = mid-1;
    //         } else {
    //             System.out.print(mid);
    //             break;
    //         }

    //     }

    // }
}