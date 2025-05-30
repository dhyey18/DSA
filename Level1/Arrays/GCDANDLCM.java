class GCDANDLCM {
    public static void main(String args[]) {
    
        int n1 = 24;
        int n2 = 36;

        int on1= n1;
        int on2 = n2;

        int r = 0;

        while(n1 % n2 != 0) {
            
            r = n1 % n2;
            
            n1 = n2;
            n2 = r;

        }

        int gcd = r;

        int lcm = (on1*on2) / gcd;
        
        System.out.print(gcd + " -- " +lcm);
    }
}