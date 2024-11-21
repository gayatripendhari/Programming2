/*
 * WAJP  to remove duplicate character from a given String;
*/

public class A29 {
    public static void main(String[] args){

        String str = "Hello World";
        String temp="";

        for(int i=0;i<str.length();i++){
            boolean flag = false;
            char ch = str.charAt(i);
            for(int j=0;j<temp.length();j++){
                if(temp.charAt(j)==ch){
                    flag = true;
                    break;
                }

            }
            if(!flag)
            temp += str.charAt(i);
        }
        str = temp;
        System.out.println(str);

    }
}
