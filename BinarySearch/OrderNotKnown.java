class OrderNotKnown {
    public static void main(String args[]) {

        // int arr[] = {5,4,3,2,1};
        int arr[] = {1,2,3,4,5};

        int val = 4;
        boolean isDec = false;

        if(arr.length > 1) {
            if(arr[0] > arr[1]) 
                isDec = true; 
        }

        if(isDec)
            dec(arr,val);
        else
            asc(arr,val);

    }

    public static void dec(int arr[],int val) {

        int l = 0;
        int r = arr.length-1;

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

    public static void asc(int arr[],int val) {

        int l = 0;
        int r = arr.length-1;

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