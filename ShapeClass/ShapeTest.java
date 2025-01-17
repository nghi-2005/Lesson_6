package ShapeClass;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle2 = new Triangle(3, 4, 5, "Màu ");
        System.out.println(triangle2);

        Triangle triangle1 = new Triangle(2.3, 2, 65, "jfsdhsgdkjfh");
        triangle1.display();
    }
}
