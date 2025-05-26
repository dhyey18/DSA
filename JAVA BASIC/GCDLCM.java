class GCDLCM {

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;

        int on1 = num1 , on2 = num2;

        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;
        int lcm = (on1*on2) / gcd;

        System.out.println(gcd + " : gcd , " + lcm + " : lcm");
    }
}