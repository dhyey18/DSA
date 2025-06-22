
class PrintAbveriation {
    public static void main(String args []) {

        String str = "pep";

        printAbveriation(str,"",0,0);

    }

    public static void printAbveriation(String str,String asf, int count, int pos) {

        if(str.length() == pos) {
            if(count == 0)
                System.out.println(asf);
            else
                System.out.println(asf + count);
            return;
        }

        if(count > 0)
            printAbveriation(str,asf + count + str.charAt(pos),0,pos + 1);
        else
            printAbveriation(str,asf + str.charAt(pos),0,pos + 1);

        printAbveriation(str,asf,count + 1,pos + 1);

    }
}