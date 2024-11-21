/*
 *  WAJP to print all the possible substring of a given string.
*/
public class A28 {
    public static void main(String[] args) {
        String str= "Hello";
        char arr[] = str.toCharArray();
        int index =0;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i, j+1));
            }
        }
    }
}
