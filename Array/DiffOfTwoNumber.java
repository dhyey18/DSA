
class DiffOfTwoNumber    {
    
    public static void main(String args[]) {
        
        int arr1[] = {1,0,0,0};
        int arr2[] = {1};
        
        int ans[] = new int[arr1.length];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int c = 0;

        while(k>=0) {

            int diff = 0;
            int a2v = j >= 0 ? arr2[j] : 0; // main logic

            if(arr1[i] + c >= a2v) {
                diff = arr1[i] + c - a2v;
                c = 0;
            } else {
                diff = arr1[i] + c + 10 - a2v;
                c = -1;
            }
            
            ans[k] = diff;

            i--;
            j--;
            k--;

        }

        int index = 0;
        while(index < ans.length) {
            if(ans[index] == 0) {
                index++;
            } else {
                break;
            }
        }

        while(index < ans.length) {
            System.out.print(ans[index]);
            index++;
        }
    }
    
    // public static void main(String args[]) {
        
    //     int arr1[] = {1,0,0};
    //     int arr2[] = {1};
        
    //     int ans[] = new int[arr1.length];

    //     int i = arr1.length - 1;
    //     int j = arr2.length - 1;
    //     int k = ans.length - 1;

    //     while(j>=0) {

    //         if(arr1[i] < arr2[j]) {
    //             arr1[i-1]--;
    //             arr1[i] = arr1[i] + 10;
    //         }
            
    //         ans[k] = arr1[i] - arr2[j];

    //         i--;
    //         j--;
    //         k--;

    //     }

    //     while(k>=0) {

    //         if(arr1[i] > 0)
    //             ans[k] = arr1[i];

    //         i--;
    //         k--;
    //     }


    //     for (int q = 0; q < ans.length; q++) {
    //         System.out.print(ans[q]);
    //     }
    // }
}