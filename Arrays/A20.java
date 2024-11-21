/*
 * WAJP to count the number of digits in a given number.
*/
public class A20 {
    public static void main(String[] args) {
        int n=12334456;
        int copy =n;
        int count =0;
        while(copy!=0){
            copy /= 10;
            count++;

        }
        System.out.println(count+" no of digits present in number " +n);
    }
}
