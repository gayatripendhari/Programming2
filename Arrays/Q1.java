/*
 * Write a Java Program to print first n Perfect numbers.
*/
//import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
       // Scanner s = new Scanner(System.in);
        int count =5;

        if(count>=1 && count<=4){
            //System.out.println("Enter a number: ");
            int n = 1;
            while (count>0) {
                int sum=0;
    
                for(int f=1;f<=n/2;f++){
                    if(n%f==0){
                        sum+=f;
                    }
                    
                }
                if(sum==n){
                    System.out.println(n);
                    count--;
                }
                n++;
            }
    
        }
        
    }

}
    

