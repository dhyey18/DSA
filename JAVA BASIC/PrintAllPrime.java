import java.util.Scanner;

class PrintAllPrime {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i=low; i<=high; i++) {
            Boolean flag = false;
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(i +"Is A Prime");
            }
        }
    }
}