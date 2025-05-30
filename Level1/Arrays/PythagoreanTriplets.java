import java.util.Scanner;

class PythagoreanTriplets {
    public static void main(String args[]) {
    
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int max = n1;

        if(n2 > max) {
            max = n2;
        }

        if(n3 > max) {
            max = n3;
        }

        if(max == n1) {
            System.out.print(((n2*n2)+(n3*n3)) == (n1*n1));
        } else if (max == n2) {
            System.out.print(((n1*n1)+(n3*n3)) == (n2*n2));
        } else {
            System.out.print(((n1*n1)+(n2*n2)) == (n3*n3));
        }

    }
}