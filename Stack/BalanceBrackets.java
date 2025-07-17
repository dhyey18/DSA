import java.util.Stack;

class BalanceBrackets {
    public static void main(String args[]) {
        
        String str = "{(a+b)+(b+c)}";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if(ch == ')') {
                boolean val = solve(st,'(');
                if(val == false) {
                    System.out.print(val);
                    return;
                }
            } else if(ch == '}') {
                boolean val = solve(st,'{');
                if(val == false) {
                    System.out.print(val);
                    return;
                }
            } else if(ch == ']') {
                boolean val = solve(st,'[');
                if(val == false) {
                    System.out.print(val);
                    return;
                }
            }                
        }

        if(st.size() == 0) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

    }

    public static boolean solve(Stack<Character> stack, char ch) {
        
        if(stack.size() == 0) {
            return false;
        } else if(stack.peek() != ch) {
            return false;
        } else {
            stack.pop();
            return true;
        } 
        
    }
}