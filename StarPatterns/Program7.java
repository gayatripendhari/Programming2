/*
  *
  *
* * * * *
  *
  *

*/

class Program7{
    public static void main(String[] args) {
        int n=5;
        int m=(n/2)+1;
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==m || j==m){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}