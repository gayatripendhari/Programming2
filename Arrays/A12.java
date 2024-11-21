/*WAJP to check whether given two Strings are palindrome or not.*/
public class A12 {
    public static void main(String[] args) {
        String s1 ="nayan";
        String rev="";
        for(int i=s1.length()-1;i>=0;i--){
            rev += s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println("It is palindrome");
        }
    }
}
