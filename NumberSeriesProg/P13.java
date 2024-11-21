package NumberSeriesProg;
//WAJP program to check whther  a given number is palindrome or not.
import java.util.Scanner;
public class P13 {
    public static boolean isPalindrome(int n){
        boolean res = false;
        int rev =0;
        int temp = n;
        while (n!=0) {
            int d= n%10;
            n = n/10;
            rev = rev*10+d;
        }
        if(rev==temp){
            res =true;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= s.nextInt();
        if(isPalindrome(n)){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
    }
    
}
