package NumberSeriesProg;
//create a method which returns the largest digit of a number.
public class P11 {
    public static int  largestDigit(int n){
        int largest = n%10;
        int temp = 0;
         while (n!=0) {
            temp = n%10;
            n = n/10;
            if(largest<temp){
                largest = temp;
            }
         }
        return largest;
}
public static void main(String[] args) {
    int n =45674531;
    System.out.println(largestDigit(n));
}
}
