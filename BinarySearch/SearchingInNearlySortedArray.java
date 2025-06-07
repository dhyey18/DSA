class SearchingInNearlySortedArray {
    public static void main(String args[]) {

        int arr[] = {5,10,30,20,40};
        int val = 10;

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        asc(arr,val,start,end,n);

    }

    // public static int minIndex(int start, int end, int n, int[] arr) {

    //     while(start <= end) {

    //         if (arr[start] <= arr[end]) {
    //             return start;
    //         }

    //         int mid = start + (end - start) / 2;
    //         int next = (mid + 1) % n;
    //         int prev = (mid + n - 1) % n;

    //         if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
    //             return (mid); 
    //         }

    //         if(arr[start] <= arr[mid]) {
    //             start = mid + 1;
    //         } else if(arr[mid] <= arr[end]) {
    //             end = mid - 1;
    //         }

    //     }

    //     return -1;

    // }


    public static void asc(int arr[],int val , int l, int r , int n) {

        while(l <= r) {

            int mid = l + (r - l) / 2;

            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if(arr[mid] == val) {
                System.out.print(mid);
                break;
            } else if(arr[next] == val) {
                System.out.print(next);
                break;
            } else if(arr[prev] == val) {
                System.out.print(prev);
                break;
            } else if(val > arr[mid]) {
                l = mid + 2;
            } else {
                r = mid - 2;
            }

        }

    }
}