/*WAJP to remove duplicate characters from a given string.*/

import java.util.LinkedHashSet;

public class A13 {
    public static void main(String[] args) {
        String str = "Hello World";
  
        char arr[] = str.toCharArray();
        LinkedHashSet<Character>s=new LinkedHashSet<Character>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);

        //System.out.println(str);
     /*   String temp ="";
        for(int i=0;i<str.length();i++){
            boolean flag = false;
            for(int j=0;j<temp.length();j++){
                flag = true;
                break;
            }
            if(!flag)
            temp += str.charAt(i);
        }
        str = temp;
        System.out.println(str);
         */
    }
    
}
