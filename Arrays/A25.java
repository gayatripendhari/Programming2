/*
 * WAJP to get the count of character spaces present inside a given string.
*/
public class A25 {
    public static void main(String[] args) {
        String str = "Java is a programmig language which supports oop";
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
