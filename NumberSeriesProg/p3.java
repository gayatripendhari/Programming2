package NumberSeriesProg;
//WAJP to count the number of digits in the given number
public class p3 {

    public static int countOfDigits(int n){
        int count =0;
        while(n!=0){
            int i= n%10;
            count++;
            n = n/10;
        }
        return(count);
        
    }
    public static void main(String[] args) {
        int n =123456;
        System.out.println(countOfDigits(n));
    }
    
}
