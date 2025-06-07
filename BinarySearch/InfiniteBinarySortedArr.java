class InfiniteBinarySortedArr {
    public static void main(String args[]) {

        int arr[] = {0,0,0,0,0,0,1,1,1,1};
        int val = 1;

        int start = 0;
        int end = 1;

        while(val > arr[end]) {
            start = end;
            end = end * 2;
        }

        System.out.println(start + " - " +end);

        first(arr,val,start,end);

    }

    public static void asc(int arr[],int val , int l, int r , int n) {

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(arr[mid] == val) {
                System.out.println(mid);
                return;
            } else if(val > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        System.out.println(-1);

    }

    public static void first(int arr[], int val, int l, int r) {

        int res = -1;

        while(l <= r) {

            int mid = (l + r) / 2;

            if(arr[mid] == val) {
                res = mid;
                r = mid - 1;
            } else if(val > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            
        }

        System.out.print(res);

    }
}