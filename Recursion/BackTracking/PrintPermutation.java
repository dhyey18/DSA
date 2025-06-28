class PrintPermutation {
    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str, 0);
    }

    public static void printPermutation(String str, int pointer) {
        if (pointer == str.length() - 1) {
            System.out.println(str);
            return;
        }

        for (int i = pointer; i < str.length(); i++) {
            str = swap(str, pointer, i);
            printPermutation(str, pointer + 1);
            str = swap(str, pointer, i); // backtrack
        }
    }

    public static String swap(String str, int a, int b) {
        char[] charArray = str.toCharArray();
        char temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
        return new String(charArray);
    }
}
