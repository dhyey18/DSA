import java.util.Stack;

class AreaOfHistogram {
    public static void main(String args[]) {
        
        int[] arr = {6,2,5,4,5,1,6};

        int[] srs = new int[arr.length];
        int[] sls = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        sls[0] = -1;
        
        for(int i=1; i<arr.length; i++) {

            while(st.size() > 0 && arr[i] < arr[st.peek()]) {
                st.pop();
            }

            if(st.size() == 0) {
                sls[i] = -1;
            } else {
                sls[i] = st.peek();
            }

            st.push(i);
        }

        Stack<Integer> st2 = new Stack<>();
        
        st2.push(arr.length-1);
        srs[arr.length-1] = arr.length;
        
        for(int i=arr.length - 2; i>=0; i--) {

            while(st2.size() > 0 && arr[i] < arr[st2.peek()]) {
                st2.pop();
            }

            if(st2.size() == 0) {
                srs[i] = -1;
            } else {
                srs[i] = st2.peek();
            }

            st2.push(i);
        }

        int maxArea = 0;

        for(int i=0; i<arr.length; i++) {
            int width = srs[i] - sls[i] - 1;
            int area = width * arr[i];
            if(area > maxArea) {
                maxArea = area;
            }
         }

        System.out.print(maxArea);

    }
}