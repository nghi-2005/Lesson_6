public class TestCircleAndCylinder {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);
        System.out.println("Area: " + circle1.getArea());

        Cylinder cylinder2 = new Cylinder(2.0, 3.0);
        cylinder2.setColor("green");
        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());

    }
}