import java.util.Scanner;

class Fibonachi {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();

        int a = 0;
        int b = 1;
        int fibo = a+b;

        for (int i = 2; i < t; i++) {
            System.out.println(fibo);
            a = b;
            b = fibo;
            fibo = a + b;
        }
        
    }
}