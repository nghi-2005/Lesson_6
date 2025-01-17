package ShapeClass;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }
    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setColor(String color) {
        super.setColor(color);
    }
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    @Override
    public String toString() {
        return"Triangle [" +
                "color=" + super.getColor() + ", " +
                "area=" + getArea() + ", " +
                "perimeter=" + getPerimeter() + "]";
    }
    public void display() {
        System.out.println("The area of the triangle is: " + getArea());
        System.out.println("The perimeter of the triangle is: " + getPerimeter());
        System.out.println("The color of the triangle is: " + super.getColor());
    }
}
