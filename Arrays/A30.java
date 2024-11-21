/*
 * WAJP to check whether the given to string are anagram of each other.
*/

import java.util.Arrays;

public class A30 {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2= "listen";
        char arr[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(str1.length() == str2.length()){
            if(Arrays.equals(arr,arr2)){
                System.out.println("Given to Strings are anagram of each other");
            }
            else{
                System.out.println("They are not anagram of each other");
            }
        }
        else{
            System.out.println("They are not anagram of each other");
        }
    }
}
