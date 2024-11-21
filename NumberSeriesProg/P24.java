//WAJP to check whether a given number is happy number or not.

/*
 * Happy Number: 
 * Ex 13 => 1^2 + 3^2 => 1+9=>10 
 * 10=> 1^2 + 0^2 =1 //given number is happy number.
 * 
 * ex2. 26 = 2^2 + 6^2 = 4+36 = 40
 * 40 = 4^2 + 0^2 = 16
 * 16 = 1^2 + 6^2 = 1+36 =37
 * so 26 is not a happy number. 
*/
import java.util.Scanner;
public class P24 {
    public static int power(int n){
        int power=1;
        int sum = 0;
        while(n!=0){
            int d =n%10;
            n = n/10;
            power = d*d; 
            sum +=power;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int res = power(n);
        System.out.println(res);
        if(res==1){
            System.out.println("It is a happy number.");
        }

        else{
            n= res;
            res =power(n);
            System.out.println(res);
            if (res==1) {
                System.out.println("It is a happy number");
            }
            else{
                n= res;
                res =power(n);
                System.out.println(res);
            }
            
        }
        
    }
    
}
