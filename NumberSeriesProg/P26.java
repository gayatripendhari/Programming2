//WAJP to given number is automorphic or not.
/*
 * Ex1. 5 = 25 = 625 //last digit same as oringnal num
 * 
 * Ex2. 6 =36
 * 
 Ex3. 8= 64 //not automorphic 
*/
public class P26 {
    public static int power(int n){
        int power=1;

        while(n!=0){
            int d =n%10;
            n = n/10;
            power = d*d; 
        }
        return power;
    }
    public static void main(String[] args) {
        int n=6;
        int copy = n;
        int res = power(n);
        int d = res%10;
        if(copy==d){
            System.out.println("It is Automorphic number. ");
        }
        else{
            System.out.println("It is not automorphic number");
        }
    }
}
