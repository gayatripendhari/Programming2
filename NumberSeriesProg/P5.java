package NumberSeriesProg;
/*
WAJP to identify the average of digits of a given number.
WAJP to identify the given number is positive number or negative number.
*/ 
import java.util.Scanner;
public class P5 {
    public static int average(int n){
        int sum = 0;
        int count =0 ;
        while (n!=0) {
            int d = n%10;
            sum=  sum + d;
            n= n/10;
            count++;
        }

        int avg= sum/count;
        return avg;
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter Any number having more than 1 digit: ");
        int n = s.nextInt();
        System.out.println(average(n));
    }
    
}
