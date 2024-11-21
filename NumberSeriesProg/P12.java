package NumberSeriesProg;
//Reverse the givien number
import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Reverse of given number is: "+reverse(n));
    }

    public static int reverse(int n){
        int rev=n%10;
        n= n/10;
        while (n!=0) {
            int d= n%10;
            n = n/10;
            rev = rev*10+d;
        }
        return rev;
    }
    
}
