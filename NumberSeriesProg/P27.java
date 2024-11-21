public class P27 {
    public static void main(String[] args) {
        int num =5;
        int copy =num;
        int num1 = num*num;
        boolean res = true;

        while (num!=0) {
            if(num%10==num1%10){
                num/=10;
                num1/=10;
            }
            else{
                res =false;
                break;
            }
        }
        if(res == true){
            System.out.println(copy +" is Automorphic");
        }
        else{
            System.out.println(copy+" is not Automorphic");
        }
    }
    
}
