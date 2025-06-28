class LargestNumberInKSwap {

    static String max;

    public static void main(String args[]) {
        String str = "5477";
        int k = 3;
        max = str; // Initialize max with the original string
        largestNumberInKSwap(str, 0, k);
        System.out.print(max);
    }

    public static void largestNumberInKSwap(String str, int pointer, int k) {
        if (k == 0 || pointer == str.length() - 1) {
            return;
        }

        char maxDigit = str.charAt(pointer);

        for (int i = pointer + 1; i < str.length(); i++) {
            if (str.charAt(i) > maxDigit) {
                maxDigit = str.charAt(i);
            }
        }

        if (maxDigit != str.charAt(pointer)) {
            for (int i = pointer + 1; i < str.length(); i++) {
                if (str.charAt(i) == maxDigit) {
                    str = swap(str, pointer, i);
                    if (str.compareTo(max) > 0) {
                        max = str;
                    }
                    largestNumberInKSwap(str, pointer + 1, k - 1);
                    str = swap(str, pointer, i); // backtrack
                }
            }
        } else {
            largestNumberInKSwap(str, pointer + 1, k);
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
