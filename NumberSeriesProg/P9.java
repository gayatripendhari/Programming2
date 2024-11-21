package NumberSeriesProg;
//WAJP to find Area of Circle
public class P9 {
    public static double area(float r){
        double a = 0;
        a = 3.14 * r *r;
        return a ;
    }

    public static int area(int a){
        int area1 = 0;
        area1 =  a * a;
        return area1 ;
    }

    public static double area(float l , float b){
        double area1 = 0;
        area1 =  l * b;
        return area1 ;
    }
    public static void main(String[] args) {
        float r = 2;
        System.out.println("Area of Circle is: "+area(r));
        int a=10;
        System.out.println("Area of Square is: "+area(a));
        //System.out.println(area(r));
        float l = 1;
        float b = 12;
        System.out.println("Area of Rectangle is: "+area(l, b));

    }
    
}
