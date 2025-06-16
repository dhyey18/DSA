class SearchingInSortedMatrix {
    public static void main(String args[]) {

        int arr[][] = 
        {
            {10,20,30,40},
            {15,25,35,45},
            {25,29,37,48},
            {32,33,39,50}
        };

        int val = 2;
        int i = 0;
        int j = arr[0].length-1;

        searchInMatrix(arr,i,j,val);
    
    }

    public static int searchInMatrix(int arr[][], int i, int j , int val) {

        while(i <= arr[0].length-1 && j > 0) {

            if(arr[i][j] > val) {
                j--;
            } else if(arr[i][j] < val) {
                i++;
            } else {
                System.out.print(arr[i][j]);
                break;
            }

        }

        return(-1);

    }

}