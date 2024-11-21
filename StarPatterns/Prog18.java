public class Prog18 {
    /*
A
B C
D E F
G H I J
      
    */
    public static void main(String[] args) {
        int n=4;
        char a = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print(a++ +" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

