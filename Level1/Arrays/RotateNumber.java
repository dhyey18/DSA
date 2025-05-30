class RotateNumber {
    

    // Corrected method name
    public static int countDigit(int num) {
        int td = 0;
        while (num > 0) {
            num = num / 10;
            td++;
        }
        
        System.out.println("total: " + td);

        return td;
    }

    // Corrected reverse method
    public static int rotateANumber(int x, int k) {
        int td = countDigit(x);

        if(k < 0) {
            k = k + td;
        }

        if(k > td) {
            k = k % td;
        }

        int mul = (int) Math.pow(10, td - 1);

        while (k > 0) {
            int r = x % 10;
            x = x / 10;
            int trn = mul * r;
            x += trn;
            k--;
        }

        return x;
    }

    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int num = 1234;
        int k = 5;

        

        int reversed = rotateANumber(num,k);
        System.out.println("Roatted number: " + reversed);
    }

}