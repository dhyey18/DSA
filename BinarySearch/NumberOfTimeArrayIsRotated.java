class NumberOfTimeArrayIsRotated {
    public static void main(String args[]) {

        int arr[] = {11,12,15,18,2,4,6,8};

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        while(start <= end) {

            if (arr[start] <= arr[end]) {
                System.out.print(start);
                break;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                System.out.print(mid); 
                break;
            }

            if(arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if(arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }

    }
}