package abstracts.task6;

public class Main {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(7.0);
        Shape3D cube = new Cube(6.0);

        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
    }
}
