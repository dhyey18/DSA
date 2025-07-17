import java.util.Stack;

class StockSpan {
    public static void main(String args[]) {

        int[] input = {3, 2, 8, 6, 4, 1, 7, 2, 8};
        int[] ans = new int[input.length];
        
        Stack<Integer> st = new Stack<>();
        ans[0] = 1;
        st.push(0);

        for (int i = 1; i < input.length; i++) {
        
            while(st.size() > 0 && input[i] >= input[st.peek()]) {
                st.pop();
            }
            
            if(st.size() == 0) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);

        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);            
        }

    }

    public static boolean solve(Stack<Character> stack, char ch) {
        
        return false;   
    }
}