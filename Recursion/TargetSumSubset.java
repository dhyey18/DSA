class TargetSumSubset {
    public static void main(String args[]) {

        int arr[] = {10,20,30,40,50};

        int target = 60;

        // ArrayList<Integer> output = new ArrayList<>(arr.length);

        printTargetSumSubset(arr,target,0,0,"");


    }

    public static void printTargetSumSubset(int arr[] , int target ,int index, int totalSum , String op) {


        if(index == arr.length) {
            if(totalSum == target) {
                System.out.println(op);
            }
            return;
        }

        printTargetSumSubset(arr,target,index + 1,totalSum + arr[index],op+arr[index]+" , ");
        printTargetSumSubset(arr,target,index + 1,totalSum,op);
        
    }

}