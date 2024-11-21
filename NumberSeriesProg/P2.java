package NumberSeriesProg;
//WAJP to  remove the last digit from by returning the remaining value from another metheod
public class P2 {
    public static int removeLastDigit(int n){
        int r = n/10;
        return(r);
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println(removeLastDigit(n));
    }
    
}
