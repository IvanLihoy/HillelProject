import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortArray {
    
    public static void main(String[] args) {
       sortArrayNumbers();
    }

    private static void sortArrayNumbers() {
        Integer[] arr = new Integer[]{9, 2, 7, 4, 5, 6, 3, 8, 1, 9, 22, 34, 84};

        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list, Collections.<Integer>reverseOrder());
        System.out.println(list);

//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));

    }
}