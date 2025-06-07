class InfiniteSortedArry {
    public static void main(String args[]) {

        int arr[] = {1,2,3,4,5,5,5,6,6,6,7,8,9,10,11,12,13,14,15};
        int val = 10;

        int start = 0;
        int end = 1;
        int n = 0;

        while(end < val) {
            start = end;
            end = end * 2;
        }

        asc(arr,val,start,end,n);

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
}