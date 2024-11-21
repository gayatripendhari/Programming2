//WAJP to remove duplicate values from the Array.
import java.util.Arrays;
class Array1{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,1,3,4};
        int size = arr.length;
        int arr2[] = new int[size];
        int index =0;

        for(int i=0;i<=size-1;i++){
            
            boolean flag =false;
            for(int j=0;j<=index;j++){
                if(arr[i]==arr2[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                arr2[index++] = arr[i];
            }
            }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr));
        arr2 = Arrays.copyOf(arr2,index);
        System.out.println(Arrays.toString(arr2));

        }
        

    }
