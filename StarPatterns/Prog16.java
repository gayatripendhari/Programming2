public class Prog16 {
    /*
     * 
    A B
  1 2 3 4
 C D E F G H
5 6 7 8 9 10 11 12

     * 
    */
    public static void main(String[] args) {
        int n=4;
        int num= 1;
        char ch ='A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+i;j++){
                if(i+j>n){
                    if(i%2==0){
                        System.out.print(num++ +" ");
                    }
                    else{
                        System.out.print(ch++ +" ");
                    }
    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
