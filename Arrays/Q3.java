/*WAJP to count Prime numbers in a given array
 * Input array : [1,13,41,32,45,67,98]
*/
public class Q3 {
    public static void main(String[] args) {
        int arr[] = {1,13,41,32,45,67,98};
    
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=2;j<=arr[i]/2;j++){
                if(arr[i]%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(arr[i]+" is a Prime Number");
            }
            count=0;
        }
    
        
    }

    
}
