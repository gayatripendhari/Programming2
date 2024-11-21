/*
 * WAJP to check whether a given String is pangram string.
*/
public class A31 {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        str= str.toLowerCase();
        int count =0;
        for(char ch='a';ch<='z';ch++){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count==26);
    }
}
