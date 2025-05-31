class P6 {
    public static void main(String args[]) {
        int n = 5;

        int strB = n / 2 + 1;
        int strA = n / 2 + 1;
        int sp = 1;

        for(int i=1; i<=n; i++) {


            for (int j=1; j <= strB; j++) {
                System.out.print('*');                
            }

            for(int j=1; j <= sp; j++) {
                System.out.print(" ");                
            }

            for (int j=1; j <= strA; j++) {
                System.out.print("*");                
            }

            if(i <= n/2) {
                sp+=2;
                strB--;
                strA--;
            } else {
                sp-=2;
                strB++;
                strA++;
            }

            System.out.println();                
        }
    }
}