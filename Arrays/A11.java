/*
 * WAJP to print duplicate characters present inside a given String.
*/
import java.util.LinkedHashSet;
public class A11 {
    public static void main(String[] args) {
        String str = "HelloWorld";
      
        char arr[] = str.toCharArray();
        LinkedHashSet<Character>s=new LinkedHashSet<Character>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);

        // for(int i=1;i<str.length();i++){
        //     int count =1;
        //     for(int j=i-1;j>=0;j--){
        //         if(str.charAt(j)==str.charAt(i)){
        //             count++;
        //             if(count>1){
        //                 break;
        //             }
        //         }
        //     }
        //     if(count>1){
        //         System.out.println(str.charAt(i));
        //     }
        // }
    }
    
}
