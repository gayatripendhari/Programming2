import java.util.HashSet;
class Array2{
    public static void main(String[] gayatri){
        int arr[] = {1,3,2,4,5,1,4,3};
        int size = arr.length;
        HashSet <Integer> s = new <Integer>HashSet(0);
        for(int i=0;i<size;i++){
            s.add(arr[i]);
            arr[i]=arr[i+1];
        }  
        System.out.println(s);
    }
}