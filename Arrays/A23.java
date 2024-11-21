/*
 * WAJP to print words present inside a given array which have
 * even number of characters.
*/
public class A23 {
    public static void main(String[] args) {
        String str ="apple,ball,cat,dog,elephant,flower";
       // String temp="";
        String[] arr = str.split(",");

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
