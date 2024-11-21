public class Prog26 {
    //Butterfly Pattern
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<n*2;i++){
            for(int j=1;j<=n;j++){
                if(i>=j && i+j<=n*2){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
           // System.out.println();
           for(int j=2;i<=n;j++){
            if(i+j>=n+1 && i-j<=n-1){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
    }
}
