import java.util.Scanner;

class DigitCount {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int digit = scn.nextInt();
        int counter = 0;
        while(digit > 0) {
            digit = digit / 10;
            counter++;
        }
        System.out.println(counter);
    }
}