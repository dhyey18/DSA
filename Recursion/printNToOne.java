class printNToOne {
    public static void main(String args[]) {
        
        // print(5);
        System.out.println( " ----- " );
        printNToOne(5);

    }

    public static void print(int n) {

        if(n <= 0) return;

        print(n-1);
        
        System.out.println(n);

    }

    public static void printNToOne(int n) {

        if(n <= 0) return;
        
        System.out.println(n);
        
        printNToOne(n-1);

    }
}