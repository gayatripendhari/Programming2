package NumberSeriesProg;
import java.util.Scanner;

//WAJP to find out factors of a given number

public class P14 {
    public static void factors(int n){
        int fac=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fac = i;
                System.out.print(fac+", ");
            }

        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= s.nextInt();
        System.out.println("factors of a given numbers "+ n +" is: ");
        factors(n);
    }
    
}
