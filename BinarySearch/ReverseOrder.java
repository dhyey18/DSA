class ReverseOrder {
    public static void main(String args[]) {


        int arr[] = {5,4,3,2,1};
        int val = 4;
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
}