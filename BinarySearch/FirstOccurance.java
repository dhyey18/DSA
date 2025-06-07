class FirstOccurance {
    public static void main(String args[]) {

        // int arr[] = {5,4,3,2,1};
        int arr[] = {1,2,3,3,3,4,4,4};
        int val = 4;

        boolean isFirst = true;

        if(isFirst)
            first(arr,val);
        else
            last(arr,val);

    }

    public static void last(int arr[],int val) {

        int l = 0;
        int r = arr.length-1;
        int res = -1;

        while(l <= r) {

            int mid = (l + r) / 2;

            if(arr[mid] == val) {
                res = mid;
                l = mid + 1;
            } else if(val > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        System.out.print(res);

    }

    public static void first(int arr[],int val) {

        int l = 0;
        int r = arr.length-1;
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