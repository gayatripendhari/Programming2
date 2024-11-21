package NumberSeriesProg;
import java.util.Scanner;
/*
 * WAJP to identify the given number is positive number or negative number.
*/
public class P6 {
    public static void isNum(int n){
        if(n>0){
            System.out.println("Given Number is Positive..!");
        }
        else if(n<0){
            System.out.println("Given number is Negative..");
        }
        else{
            System.out.println("Given number equals to Zero. Please try Another number..");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = s.nextInt();
        isNum(n);
    }
    
}
