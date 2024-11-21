/*
 * WAJP to arrange given array as mentioned below:
 * arr = [0,1,1,0,1,0,1,1,0,0]
 * output: arr =[0,0,0,0,0,1,1,1,1,1]
*/

import java.util.Arrays;

public class A16 {
    public static void main(String[] args) {
        int arr[] ={0,1,1,0,1,0,1,1,0,0};
        //int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==0){
                        int t =arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                        break;
    
                    }
                }
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
