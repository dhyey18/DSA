class P9 {
    public static void main(String args[]) {
        int n = 5;

        int sb = n/2 + 1;
        int sa = -1;

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=sb ; j++) {
                System.out.print(" ");                
            }

            System.out.print("*");
            
            for(int j=1; j<=sa ; j++) {
                System.out.print(" ");                
            }

            if (i>1 && i<n) {
                System.out.print("*");
            }

            if(i <= n/2) {
                sb--;
                sa+=2;
            } else {
                sb++;
                sa-=2;
            }

            System.out.println();                
        }
    }
}