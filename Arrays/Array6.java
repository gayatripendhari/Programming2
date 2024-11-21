/* WAJP to merge two Arrays.*/

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int size1 = arr1.length;
        int arr2[] = {5,6,7,8};
        int arr[]=new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr2.length;i++){
                arr[size1]=arr2[i];
                size1++;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
