import java.util.Scanner;
class RotateANumber {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        
        int number = scn.nextInt();
        int k = scn.nextInt();

        int digit = number;
        int counter = 0;
        int temp = digit;

        while(temp > 0) {
            temp = temp / 10;
            counter++;
        }

        int power = (int)Math.pow(10,counter-1);

        for(int i=0; i<k; i++) {
            int lastDigit = number % 10;
            number = number / 10;

            number = (lastDigit * power)+number;
        }

        System.out.println(number);

    }
}