package abstracts.task10;

public class Main {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle();
        Shape2D circle = new Circle();

        rectangle.draw();
        rectangle.resize();

        circle.draw();
        circle.resize();
    }
}
