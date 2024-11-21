//WAJP to identify whether the given number is strong number or weak number.
/*
 * The summation of each digit factorial of a number is equals to a given number.
 * 145 = 145
 * 124 = 1+ 2*1 + 4*3*2*1
*/
public class P20 {
    public static void main(String[] args) {
        int num=145;
        int copy = num;
        int sum =0;

        while(num!=0){
            int d=num%10;
            int fact=1;

            for(int i=1;i<=d;i++){
                    fact *= i;
            }
            sum += fact;
            num /= 10; 

        }
        System.out.println(sum);
        if(sum==copy){
            System.out.println("it's a Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
    
}
