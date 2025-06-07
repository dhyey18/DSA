class FindElementInSortedArray {
    public static void main(String args[]) {

        int arr[] = {11,12,15,18,2,4,6,8};
        int val = 6;

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        int min = minIndex(start,end,n,arr);

        asc(arr,val,0,min-1);
        asc(arr,val,min+1,end);

    }

    public static int minIndex(int start, int end, int n, int[] arr) {

        while(start <= end) {

            if (arr[start] <= arr[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return (mid); 
            }

            if(arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if(arr[mid] <= arr[end]) {
                end = mid - 1;
            }

        }

        return -1;

    }


    public static void asc(int arr[],int val , int l, int r) {

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(arr[mid] == val) {
                System.out.print(mid);
                break;
            } else if(val > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

    }
}