import java.util.*;

class ShortAnArray {

    public static void main(String[] args) {
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(3,4,1,8,10,7,2,5));
        
        sortArr(sortedList);
        
        System.out.println(sortedList); // Output: [1, 3, 5, 6, 7, 9]
    }
    
    public static void sortArr(List<Integer> arr) {
        
        if(arr.size() == 0) {
            return;
        }

        int popElement = arr.remove(arr.size()-1);

        sortArr(arr);
        
        insertInSortedOrder(arr, popElement);

    }

    public static void insertInSortedOrder(List<Integer> list, int value) {
        int i = 0;
        while (i < list.size() && list.get(i) < value) {
            i++;
        }
        list.add(i, value); // insert at the correct index
    }
}
