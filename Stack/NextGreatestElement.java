import java.util.Stack;

class NextGreatestElement {
    public static void main(String args[]) {

        int[] input = {3,2,8,6,4,1,7,2,8};
        int[] ans = new int[input.length];
        
        Stack<Integer> st = new Stack<>();
        
        st.push(input[input.length-1]);
        ans[input.length-1] = -1;

        for (int i = input.length - 2; i >= 0; i--) {
        
            while(st.size() > 0 && input[i] >= st.peek()) {
                st.pop();
            }
            
            if(st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            
            st.push(input[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);            
        }

    }

    public static boolean solve(Stack<Character> stack, char ch) {
        
        return false;   
    }
}