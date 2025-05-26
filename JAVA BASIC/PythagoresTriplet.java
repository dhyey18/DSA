class PythagoresTriplet {
    public static void main(String[] args) {
        int num1 = 5, num2 = 12, num3 = 13;

        int max = num1;

        if(num2 >= max) {
            max = num2;
        }
        
        if(num3 >= max) {
            max = num3;
        }

        Boolean flag = false;
        
        if(max == num1) {
            flag = ((num2 * num2 ) + (num3 * num3) == (num1 * num1)); 
        } else if(max == num2) {
            flag = ((num1 * num1 ) + (num3 * num3) == (num2 * num2)); 
        } else {
            flag = ((num1 * num1 ) + (num2 * num2) == (num3 * num3)); 
        }

        System.out.print(flag);

    }
}