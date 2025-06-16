class KokoEatingBananas {
    
    public static int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];

        for(int i=1; i<piles.length; i++) {
            if(piles[i] > max) {
                max = piles[i];
            }
        }

        int start = 1;
        int end = max;
        int result = 0;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(countTotalHours(piles,mid) <= h) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static int countTotalHours(int[] arr, int hours) {
        int totalHours = 0;
        for(int i=0; i<arr.length; i++) {
            totalHours += Math.ceil((arr[i] + hours - 1) / hours);
        }
        System.out.println(totalHours + " th " + hours);
        return totalHours;
    }

    public static void main(String args[]) {
        int arr[] = {3,6,7,11};
        int ans = minEatingSpeed(arr,8);
        System.out.print(ans);
    }

}