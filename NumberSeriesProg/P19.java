//WAJP to identify given number is perfect number or not.
/*
 * The sum of factors of a   given number , except the given number itself should
 * be equals to the given number is known as perfect number.
*/
import java.util.Scanner;
public class P19 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum==n){
            System.out.println("Yes,It's perfect number.");
        }
        else{
            System.out.println("Oopps, it's not a perfect number.");
        }


    }
    
}
