//WAJP to identify the factorial of given number.
import java.util.Scanner;
//import java.util.scanner;
public class P18 {

    public static int factorial(int n){
        int fact =1;
        while(n!=0){
            fact = n*n-1;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = s.nextInt();

        int fact =1;

        for(int i=1;i<=n;i++){
            fact = fact*i;
        }

        System.out.println("Factorial of given number  is: "+ fact);

        //System.out.println(factorial(n));
    }
}
