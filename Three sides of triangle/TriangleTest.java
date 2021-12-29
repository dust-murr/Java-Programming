public class TriangleTest {
    
    public static void main(String[] args) {
        Triangle myTriangle1 = new Triangle();
        System.out.println("Triangle 1 Perimeter: " + myTriangle1.getPerimeter());
        System.out.println("Triangle 1 String: " + myTriangle1.toString());
        
        Triangle myTriangle2 = new Triangle(4, 5, 6);
        System.out.println("Triangle 2 Perimeter: " + myTriangle2.getPerimeter());
        System.out.println("Triangle 2 String: " + myTriangle2.toString());
        
        GeometricObject myTriangle3 = new Triangle(9, 12, 15);
        System.out.println("Triangle 3 Perimeter: " + ((Triangle)myTriangle3).getPerimeter());
        System.out.println("Triangle 3 String: " + myTriangle3.toString());
        
        Triangle myTriangle4 = new Triangle(2, 3, 4, "purple", true);
        System.out.println("Triangle 4 String: " + myTriangle4.toString());
        System.out.println("Triangle 4 String: " + myTriangle4.getColor());

    }
}
