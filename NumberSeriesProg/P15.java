package NumberSeriesProg;
import java.util.Scanner;
//WAJP to print count of factors of a given number.
public class P15 {
        public static int countOfFactors(int n){
        int sum = 0;
        int count = 2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count ++;
                sum += i;
            }

        }
        //return count;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= s.nextInt();
        System.out.println(" Count factors of a given numbers: "+ countOfFactors(n));
        
    }

}
