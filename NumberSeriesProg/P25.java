//happy number or not
public class P25 {
    public static void main(String[] args) {
        int num= 82;
        int res= num;
        while(res!=1 && res!=4){
            res = happy(res);
        }

        if(res==1){
            System.out.println(num + " s a Happy Number "+res);
        }
        else if(res==4){
            System.out.println(num+" is not a Happy number "+ res);
        }
    }

    public static int happy(int n){
        int power=1;
        int sum = 0;
        while(n!=0){
            int d =n%10;
            n = n/10;
            power = d*d; 
            sum +=power;
        }
        return sum;
    }
}
