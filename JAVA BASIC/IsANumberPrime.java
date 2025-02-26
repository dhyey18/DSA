import java.util.*;

class IsANumberPrime {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i=0; i<t; i++) {
            int number = scn.nextInt();
            Boolean flag = false;

            for(int j=2; j*j<=number; j++) {
                if(number % j == 0) {
                    flag = true;
                    break;
                }
            }

            if(flag) {
                System.out.println("Not A Prime");
            } else {
                System.out.println("Is A Prime");
            }
        }
    }
}