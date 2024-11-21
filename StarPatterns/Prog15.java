/*
 * 
1 1 1 1
A A A A
2 2 2 2
B B B B

*/

public class Prog15 {
    public static void main(String[] args) {
        int n =4;
        int num=1;
        char ch = 'A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                    if(i%2==0){
                        System.out.print(ch+" ");
                    }
                    else{
                        System.out.print(num+" ");
                    }
            
            }
            if(i%2==0){
                ch++;
            }
            else{
                num++;
            }
            System.out.println();
        }
    }
}
