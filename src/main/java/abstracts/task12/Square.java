package abstracts.task12;

public class Square  extends GeometricShape{

    private double lengthSide;

    public Square(double lengthSide) {
        this.lengthSide = lengthSide;
    }

    @Override
    public double area() {
        return Math.pow(lengthSide,2);
    }

    @Override
    public double perimeter() {
        return 4.0 * lengthSide;
    }
}
