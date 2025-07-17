import java.util.Stack;

class NextGreatestElementAlternative {
    public static void main(String args[]) {
        int[] input = {3, 2, 8, 6, 4, 1, 7, 2, 8};
        int[] ans = new int[input.length];

        Stack<Integer> st = new Stack<>();

        for (int i = input.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && input[i] >= input[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = input[st.peek()];
            }

            st.push(i);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
