/* 
WAJP to check is whether palindrome. If it is palindrom print true oterwise print false. 
 * 
*/
public class A27 {
    public static void main(String[] args) {
        String str = "NAYAN";
        String rev="";

        for(int i=str.length()-1 ;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev.equals(str));
    }
}
