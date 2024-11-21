package NumberSeriesProg;
//WAJP to identify only even digits from a given number
public class P7 {
    public static int sumOfEvenDigits(int n){
        int sum = 0;
       // int even = 0 ;
        while(n!=0)
        {  
          //  int sum=0;
            int d = n%10;
            n= n/10;
            if(d%2==0){
               // even = d;
                sum += d;
            }
        }

        return sum;
    }
    public static void main(String[] args){
        int n=451263;
        System.out.println(sumOfEvenDigits(n));
    }
}
