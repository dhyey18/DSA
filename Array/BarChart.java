class BarChart {
    public static void main(String args[]) {
        
        int arr[] = {3,1,0,7,5};

        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
        }

        for(int i=max; i>0; i--) {

            for(int j=0; j<arr.length; j++) {
            
                if(i > arr[j]) {
                System.out.print(" ");
                } else {
                System.out.print("*");
                }
            
            }
            
            System.out.println();
        }

    }
}