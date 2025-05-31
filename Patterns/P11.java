class P11 {
    public static void main(String args[]) {
        
        int n = 5;
        int a = -1;
        int b = 1;

        for(int i=1; i<=n; i++) {
            

            for(int j=1; j<i; j++) {

                int fibo = a + b;
                
                System.out.print(fibo + " ");

                a=b;
                b=fibo;
                fibo=a+b;

            }

            System.out.println();
             
        }
    }
}