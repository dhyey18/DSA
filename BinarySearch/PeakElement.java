class PeakElement {
    public static void main(String args[]) {

        int arr[] = {1,2};

        int start = 0;
        int end = arr.length-1;

        asc(arr,start,end,arr.length);
    }

    public static void asc(int arr[], int l, int r , int n) {

        while(l <= r) {

            int mid = l + (r - l) / 2;


            if(mid > 0 && mid < n-1) {

                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                    System.out.println(arr[mid]);
                    break;
                } else if(arr[mid-1] < arr[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            } else if(mid == 0) {
                if(arr[mid] > arr[mid+1]) {
                    System.out.println(arr[mid]);
                    break;
                }
                l = mid + 1;
            } else if(mid == n-1) {
                System.out.println(mid);
                if(arr[mid] > arr[mid-1]) {
                    System.out.println(arr[mid]);
                    break;
                }
            }

        }

        System.out.println(-1);

    }
}