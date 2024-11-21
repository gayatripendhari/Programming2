package NumberSeriesProg;
//WAJP to  print sum of factors of a given number
import java.util.Scanner;
public class P16 {
    public static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Factorial of a given number is:"+ factorial(n));
    }
    
}
