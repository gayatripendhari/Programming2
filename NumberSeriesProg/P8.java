package NumberSeriesProg;
//WAJP to create a method which returns average of odd digits from a given number.
public class P8 {
    public static int avgOfOddDigits(int n){
        int sum = 0;
        int count = 0 ;
        while(n!=0)
        {  
          //  int sum=0;
            int d = n%10;
            n= n/10;
            if(d%2==1){
               count ++;
                sum += d;
            }
        }
        int avg = sum/count; 
        return avg;
    }
    public static void main(String[] args){
        int n=451263;
        System.out.println(avgOfOddDigits(n));
    }

}
