/*
 * WAJP to print pair of of elements from a given array whose sum is equals to n 
*/
public class Array8 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int n= 9;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int index =i+1;index<arr.length;index++){
                sum= arr[i]+ arr[index];
                if(sum==n){
                    System.out.println(arr[i]+","+arr[index]);
                }
            }

        }
    }
    
}
