class SearchInAnBitonicArray {
    public static void main(String args[]) {

        int arr[] = {1,3,8,12,4,2};
        int val = 12;
        int start = 0;
        int end = arr.length-1;

        int peakIndex = peak(arr,start,end,arr.length);
    
        asc(arr,val,start,peakIndex);
        dec(arr,val,peakIndex,end);
    
    }

    public static int peak(int arr[], int l, int r , int n) {

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(mid > 0 && mid < n) {

                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                    return mid;
                } else if(arr[mid-1] < arr[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            } else if(mid == 0) {
                if(arr[mid] > arr[mid+1]) {
                    return mid;
                }
            } else if(mid == n-1) {
                if(arr[mid] > arr[mid-1]) {
                    return mid;
                }
            }

        }

        return(-1);

    }

     public static void dec(int arr[],int val,int l,int r) {

        while(l <= r) {

            int mid = (l + r) / 2;

            if(arr[mid] == val) {
                System.out.print(mid);
                break;
            } else if(val < arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

    }

    public static void asc(int arr[],int val,int l,int r) {

        while(l <= r) {

            int mid = (l + r) / 2;

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