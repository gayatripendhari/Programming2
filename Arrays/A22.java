//WAJP to convert 1st chr of each word into uppercase in a given string.
public class A22 {
    public static void main(String[] args) {
        String str ="apple,ball,cat,dog,elephant,flower";
        String temp="";
        String[] arr = str.split(",");

        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1){
                temp +=(char)(arr[i].charAt(0)-32)+arr[i].substring(1,arr[i].length())+",";
            }
            else{
                temp +=(char)(arr[i].charAt(0)-32)+arr[i].substring(1,arr[i].length());
            }

        }
        System.out.println(temp);
    }
    
}
