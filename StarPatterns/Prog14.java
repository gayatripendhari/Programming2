public class Prog14 {
/*
 
 1  2  3  4  5  6  7
 8  9  10 11 12
  13 14 15
   16

*/
    public static void main(String[] args) {
        int n=4;
        int a=1;

        for(int i=n;i>=1;i--){
            for(int j=1;j<n+i;j++){
                if(j+i>n){
                    if(a<=9){
                        System.out.print(a++ +"  ");//2space
                    }
                    else{
                        System.out.print(a++ +" ");//1space
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
