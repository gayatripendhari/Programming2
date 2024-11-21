import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,2,1,3,4,2};
        System.out.println(Arrays.toString(arr));
        int index =0;

        for(int i=1;i<arr.length;i++){
            boolean flag = false;
            for(int j=i-1;j>=0;j--){
                if(arr[j]==arr[i]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr[index++] = arr[i];
            }
        }
        arr = Arrays.copyOf(arr,index);
        System.out.println(Arrays.toString(arr));
    }
}
