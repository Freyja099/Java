package Package3;

import java.util.Scanner;
public class MathClass {
    public static void main(String[] args){

        double x = 1.0;
        double y = 2.0;

        double z = Math.max(x,y);
        System.out.println(z);

        x= -2.3;
        z = Math.abs(x);
        System.out.println(z);

        // * We can also use the sqrt() , round() , ceil(), floor()

        // TODO : Create a program the calculates the hypotenuse of a triangle
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the values of each segments : ");
        float a, b;
        a = scanner.nextFloat();
        b = scanner.nextFloat();

        double h = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        h = (int) h;
        // h = Math.round(h);
        System.out.println(" The Hypotenuse is " +h+ " cm");

        scanner.close();
    }
}
