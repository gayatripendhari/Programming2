//Write a java Program to identify given number is prime number or not
import java.util.Scanner;
public class P21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =s.nextInt();
        int count =2; 
        for(int i=2;i<n/2;i++){
            if(n%2==0){
                count++;
            
            }
            if(count>2){
                break;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime number");
        }
        else{
            System.out.println("Given number is not a prime number");
        }
    }
    
}
