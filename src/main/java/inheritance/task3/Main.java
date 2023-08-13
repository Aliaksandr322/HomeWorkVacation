package inheritance.task3;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(3, 10);
        System.out.println(shape.getArea());
        System.out.println(rectangle.getArea());
    }
}
