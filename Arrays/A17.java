/*
 * WAJP to find maximum element in given array.
*/
public class A17 {
    public static void main(String[] args) {
        int arr[] ={1,5,8,2,5,10,3,90};
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println(max);
    }
}
