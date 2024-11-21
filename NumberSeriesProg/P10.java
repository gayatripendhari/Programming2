package NumberSeriesProg;
//WAJP to identify the smallest digit from the  given number
public class P10 {
    public static int  smallestDigit(int n){
            int smallest = n%10;
            int temp = 0;
             while (n!=0) {
                temp = n%10;
                n = n/10;
                if(smallest>temp){
                    smallest = temp;
                }
             }
            return smallest;
    }
    public static void main(String[] args) {
        int n =45674531;
        System.out.println(smallestDigit(n));
    }
}
