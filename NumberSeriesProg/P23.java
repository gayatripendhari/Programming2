//WAJP to print a perfect number in the range of 1 to 100;
public class P23 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++){
            int sum = 1;  // 1 is always a divisor, so we start sum at 1
            for(int j = 2; j <= i / 2; j++){  // Loop through potential divisors up to i / 2
                if(i % j == 0){
                    sum += j;  // Add divisor to the sum
                }
            }
            if(sum == i){  // If sum of divisors equals the number, it's a perfect number
                System.out.println(i + " is a perfect number.");
            }
        }
    }
}

