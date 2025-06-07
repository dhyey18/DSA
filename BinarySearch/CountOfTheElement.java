class CountOfTheElement {
    public static void main(String args[]) {

        int arr[] = {1,2,3,3,3,4,4,4,4,4};
        int val = 3;

        int f = -1;
        int l = -1;

        f = first(arr,val);
        l = last(arr,val);

        System.out.print(l-f+1);

    }

    public static int last(int arr[],int val) {

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

        return (res);

    }

    public static int first(int arr[],int val) {

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

        return (res);

    }
}