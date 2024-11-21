/*
 * WAJP to count  words in a given String start with vowel.
*/
public class A24 {
    public static void main(String[] args) {
        String str ="apple,ball,cat,dog,elephant,flower";
        Character[] temp={'a','e','i','o','u'};
         String[] arr = str.split(",");
        int count =0;
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<temp.length;j++){
                if(arr[i].charAt(0)==temp[j]){
                    count++;
                }
            }
         }
         System.out.println(count);
    }
}
