import java.util.Scanner;
public class TriangleTest13_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        System.out.println("Enter the color of the triangle: ");
        String color = input.next();
        
        System.out.println("True or False...is the triangle filled?");
        boolean filled = input.nextBoolean();
        
        Triangle13_1 triangle = new Triangle13_1(side1, side2, side3, color, filled);
        System.out.println("-------------------------------------------");
        System.out.println(triangle);
    }
}
