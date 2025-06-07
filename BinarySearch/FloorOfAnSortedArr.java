class FloorOfAnSortedArr {
    public static void main(String args[]) {

        int arr[] = {5,10,20,30,40};
        int val = 10;

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        asc(arr,val,start,end,n);

    }

    public static void asc(int arr[],int val , int l, int r , int n) {

        int floor = Integer.MAX_VALUE;
        int ciel = Integer.MIN_VALUE;

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(arr[mid] < val) {
                floor = arr[mid];
            }

            if(arr[mid] > val) {
                ciel = arr[mid];
            }
            
            if(arr[mid] == val) {
                floor = ciel = arr[mid];
                break;
            } else if(val > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        System.out.println(floor);
        System.out.println(ciel);

    }
}