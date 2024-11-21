/*WAJP to find nth smallest and nth largest from given array containing unique elements*/

import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] arr={12,23,3,4,16,74,78,56};
        int n=3;
        int index =n-1;
        Arrays.sort(arr);

        System.out.println(n+" rd smallest element in given array is: "+arr[index]);
        System.out.println(n+" rd largest element in given array is: "+arr[arr.length-n]);
    }
    
}
