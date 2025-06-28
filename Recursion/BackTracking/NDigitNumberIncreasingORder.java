import java.util.ArrayList;


class NDigitNumberIncreasingORder {

    static ArrayList<Integer> result = new ArrayList<>();
    
    public static void main(String args[]) {

        int n = 2;

        nDigitNumberIncreasingORder(n,0,0);

        System.out.print(result);
    }

    public static void nDigitNumberIncreasingORder(int size, int current, int lastDigit) {
        
        if(size == 0) {
            result.add(current);
            return;
        }

        for(int i=lastDigit + 1; i<=9; i++) {
            nDigitNumberIncreasingORder(size-1,current * 10 + i, i);
        }

    }
}
    