package abstracts.task12;

public class Triangle extends GeometricShape{

    private double lengthSide1;
    private double lengthSide2;
    private double lengthSide3;

    public Triangle(double lengthSide1, double lengthSide2, double lengthSide3) {
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    @Override
    public double area() {
        double s = (lengthSide1 + lengthSide2 + lengthSide3) / 2;
        return Math.sqrt(s * (s - lengthSide1) * (s - lengthSide2) * (s - lengthSide3));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }
}
