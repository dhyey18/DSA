class NextChar {
    public static void main(String args[]) {

        char arr[] = {'a','c','f','h'};
        char val = 'a';

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        asc(arr,val,start,end,n);

    }

    public static void asc(char arr[],char val , int l, int r , int n) {

        char ciel = '#';

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(arr[mid] > val) {
                ciel = arr[mid];
            }
            
            if(arr[mid] == val) {
                l = mid + 1;
            } else if(val > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        System.out.println(ciel);

    }
}