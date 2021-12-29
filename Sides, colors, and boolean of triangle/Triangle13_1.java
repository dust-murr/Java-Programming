public class Triangle13_1 extends GeometricObject13_1 {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    public Triangle13_1() {
        
    }
    
    public Triangle13_1(double sideA, double sideB, double sideC) {
        this.side1 = sideA;
        this.side2 = sideB;
        this.side3 = sideC;
    }
    
    public Triangle13_1(double sideA, double sideB, double sideC, String color, boolean filled) {
        super(color, filled);
        this.side1 = sideA;
        this.side2 = sideB;
        this.side3 = sideC;
    }
    
    public double getSide1() {
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3() {
        return this.side3;
    }
    
    @Override
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3)/2;
        double area = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        return area;
    }
    
    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
