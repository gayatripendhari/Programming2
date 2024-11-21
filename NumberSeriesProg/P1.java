//WAJP to extract a last digit
package NumberSeriesProg;

public class P1 {
    //Create a method which return a last digit
    public static int lastDigit(int n) {
        int d = n%10;
        return d;
    }
     public static void main(String[] args) {
        int n =214315;
      //  int i = n%10 ;
        System.out.println("Last Digit From the given number is: "+lastDigit(n));
     }
}