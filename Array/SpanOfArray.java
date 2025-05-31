class SpanOfArray {
    public static void main(String args[]) {
        
        int arr[] = {10,20,16,32,45,30,10,12,50,2,18};

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } 

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print(max-min);

    }
}