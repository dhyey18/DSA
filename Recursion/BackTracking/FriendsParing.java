class FriendsParing {
    public static void main(String args[]) {

        int n = 3;

        boolean[] used = new boolean[n+1];

        soluction(1,n,used,"");

    }

    public static void soluction(int index , int n , boolean[] used, String asf) {

        if(index > n) {
            System.out.println(asf);
            return;
        }

        if(used[index] == true) {
            soluction(index+1,n,used,asf);
            return;
        }

        used[index] = true;
        soluction(index+1,n,used,asf+ '(' + index +')' );
        for(int i = index+1; i<=n; i++) {
            if(used[i] == false) {
                used[i] = true;
                soluction(index + 1,n,used,asf+ '(' + index + i +')');
                used[i] = false;
            }
        }
        used[index] = false;


    }
}