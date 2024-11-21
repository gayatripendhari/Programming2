//WAJP to print the prime number from the given range 1 to 100;
public class P22 {
    public static void main(String[] args) {
        //int n =100;
        int count =0;

        for(int i=2;i<=100;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" is a Prime Number");
            }
            count=0;
        }

        

    }
    
}
