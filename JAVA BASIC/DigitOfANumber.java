import java.util.Scanner;

class DigitOfANumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int digit = scn.nextInt();

        int counter = 0;
        int temp = digit;

        while(temp > 0) {
            temp = temp / 10;
            counter++;
        }

        System.out.println(counter);

        int div = (int)Math.pow(10,counter-1);

        while(digit > 0) {
            int q = digit / div;
            System.out.println(q);
            digit = digit % div;
            div = div/10;
        }

    }
}