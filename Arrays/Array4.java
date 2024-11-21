
/*
 * WAJP to delete the element at given index from an array. 
*/
import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5 };
        int index = 3;

        /*
         * for(int i= index;i<arr.length-1;i++){
         * //int temp = arr[i];
         * arr[i]=arr[i+1];
         * //arr[i+1]=temp;
         * }
         */
        for (int i = index + 1; i < arr.length; i++) {
            // int temp = arr[i];
            arr[i - 1] = arr[i];
            // arr[i+1]=temp;
        }

        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
