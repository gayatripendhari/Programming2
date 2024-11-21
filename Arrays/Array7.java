/*WAJP to merge to given arrays in zig zag manner */

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
         int arr1[] = {1,2,3,4};
         int arr2[] ={5,6,7,8};
         int arr[] = new int[arr1.length+arr2.length];
         int index =0;
         int index2 =1;
         //-----------------Way1-------------------------
        //  for(int i=0;i<arr1.length;i++){
        //     arr[index] = arr1[i];
        //     index++;
        //     arr[index]=arr2[i];
        //     index++;
        //  }
    
        //------------------ Way2 ------------------------
    /*    for(int i=0;i<arr1.length;i++){
            arr[index] = arr1[i];
            index +=2;
        }
        for(int i=0;i<arr2.length;i++){
            arr[index2] = arr2[i];
            index2 +=2;
        }
    */     
        //----------------------- Way3 -------------------------
        for(int i=0;i<arr.length;i++){
            
        }
         System.out.println(Arrays.toString(arr));
    }
    
}
