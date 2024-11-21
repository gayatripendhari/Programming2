/*
 * WAJP to replace all odd numbers present in an array by their square.
*/

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = {12,13,23,2,22,45,76};
        
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==1){
                int power = 0;
                power = arr[i]*arr[i];
                arr[i] =power;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
