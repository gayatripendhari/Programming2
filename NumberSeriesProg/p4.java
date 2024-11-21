package NumberSeriesProg;
//WAJP to identify the sum of digits og given number
public class p4 {
    public static int sum(int n){
        int res=0;
        while (n!=0) {
            int d = n%10;
            res = res + d; 
            n = n/10;   
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(sum(n));
    }
    
}
