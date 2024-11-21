/*WAJP to print first n elements of the following series
 * Series: 1,3,7,13,21,31,43,57.....
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("How many number of elements you want from series: ");
        // int n = s.nextInt();
        // int res = 1;
        // for(int i=0;i<=n;i++){
        //        res  = res+2*i;
        //        System.out.println(res);
            

        // }

        int ele=1;
        System.out.println(ele);
        int var =2;
        int n=100;

        while(n>1){
            ele += var;
            System.out.println(ele);
            var += 2;
            n--;
        }



        
    }
    
}
