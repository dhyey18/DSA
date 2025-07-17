import java.util.Stack;

class SlidingWindowMaximum {
    public static void main(String args[]) {

        int[] input = {3, 2, 8, 6, 4, 1, 7, 2, 8};
        int k = 4;
        int[] nge = new int[input.length];
        
        Stack<Integer> st = new Stack<>();

        for(int i=input.length - 1; i>=0; i--) {
            while(st.size() > 0 && input[i] >= input[st.peek()]) {
                st.pop();
            }
            if(st.size() == 0) {
                nge[i] = input.length;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        for (int i = 0; i <= input.length - k; i++) {
            int j = i;
            while (nge[j] < i + k) {
                j = nge[j];
            }
            System.out.print(input[j]);
        }

    }
}