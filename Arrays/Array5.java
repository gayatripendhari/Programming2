/*
 * WAJP to insert a element at given index in given array.
*/

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int temp[] = new int[arr.length+1];

        int ele = 10;
        int index =3;

        for(int i=0;i<temp.length-1;i++){
            temp[i]=arr[i];            
        }
        System.out.println(Arrays.toString(temp));

        for(int i=temp.length-1;i>=index;i--){
            temp[i] = temp[i-1];
        }
        temp[3] = ele;
        System.out.println(Arrays.toString(temp));

    }
    
}
