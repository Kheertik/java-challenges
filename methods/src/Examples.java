
import java.lang.*;
import java.util.*;
class examples{
    static double area(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    static double circumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String arg[]){
        double radius = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = input.nextDouble();
        System.out.println("Area = " + area(radius));
        System.out.println("Circumference = " + circumference(radius));
    }

}