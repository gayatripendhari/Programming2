/* 
 * WAJP to print the occurance of each character in a given string.
*/

import java.util.LinkedHashSet;

public class A18 {
        public static void main(String[] args) {
            String str = "HelloWorld";
            LinkedHashSet<Character>s=new LinkedHashSet<Character>();
            for(int i=0;i<str.length();i++){
                s.add(str.charAt(i));
            }
            for(char ch:s){
                int count =0;
                for(int j=0;j<str.length();j++){
                    if(ch==str.charAt(j)){
                        count++;
                    }

                }
                System.out.println(ch+"= "+count);
            }
            
        }
}
