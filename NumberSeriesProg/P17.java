//SWaping the numbers
//WAJP to  perform swapping between two given numbers
class P17 {
 public static void main(String[] args) {
    int a =10;
    int b=20;

    System.out.println("Numbers before swapping is a = "+a+ ",b = "+b);

    //By using third variable
    //int temp = a;
   // a=b;
    //b=temp;

    //without using third variable
    a= a+b;//30
    b= a-b;//10
    a = a-b; //20
    
    System.out.println("The numbers after swapping is : "+ "a = "+a+", b = "+ b);


 }
    
}
