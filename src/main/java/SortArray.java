import java.util.Arrays;
import java.util.Collections;




public class SortArray {
    public static void main(String[] args) {
        sortArrayNumbers();
    }

    private static void sortArrayNumbers(){
        Integer[] arr = new Integer[] {9,2,7,4,5,6,3,8,1,9,22,34,84};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

//        for(Integer i : arr){
//            System.out.println(i.intValue());
//        }

    }
}
