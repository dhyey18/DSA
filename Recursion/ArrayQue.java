

class ArrayQue {
    public static void main(String args[]) {
        
        int arr[] = {1,2,3,18,4,3,8,18,2};

        // print(arr,0);
        // printREverse(arr,0);

        // int max = maxOfArray(arr,0);

        // int firstIndex = firstOccurance(arr,0,18);
        // int lastIndex = lastOccurance(arr,0,2);
        int allOccurance = allOccurance(arr,0,2);

        System.out.print(allOccurance);
    }

    public static void print(int[] arr,int index) {
        if(index == arr.length) {
            return;
        }

        System.out.println(arr[index]);

        print(arr,index+1);

    }

    public static void printREverse(int[] arr,int index) {
        if(index == arr.length) {
            return;
        }

        
        printREverse(arr,index+1);
        
        System.out.println(arr[index]);
    }

    public static int maxOfArray(int[] arr,int index) {

        if(index == arr.length) {
            return 0;
        }

        int maxOfArrTillNPlusOne = maxOfArray(arr,index+1);
        
        if(arr[index] > maxOfArrTillNPlusOne) {
            return arr[index];
        } else {
            return maxOfArrTillNPlusOne;
        }

    }

    public static int firstOccurance(int[] arr,int index, int val) {

        if(index == arr.length) {
            return 0;
        }

        int firstOccuranceIndex = firstOccurance(arr,index+1,val);
        
        if(arr[index] == val) {
            return index;
        } else {
            return firstOccuranceIndex;
        }

    }

    public static int lastOccurance(int[] arr,int index, int val) {

        if(index == arr.length) {
            return -1;
        }

        int lastOccuranceIndex = lastOccurance(arr,index+1,val);
        
        if(lastOccuranceIndex == -1) {

            if(arr[index] == val) {
                return index;
            }

            return lastOccuranceIndex;
        } else {
            return lastOccuranceIndex;
        }

    }

    public static int allOccurance(int[] arr,int index, int val) {

        if(index == arr.length) {
            return 0;
        }

        int totalOccurance = 0;

        totalOccurance = allOccurance(arr,index+1,val);

        if(arr[index] == val) {
            totalOccurance++;
        }

        return totalOccurance;

    }

    
}