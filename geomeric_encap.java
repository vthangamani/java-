import java.util.Scanner;

class VolumeCalculator {
    // Private data members
    private double side;
    private double radius;
    private double height;

    // Setter methods
    public void setSide(double side) {
        this.side = side;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods to calculate volume
    public double cubeVolume() {
        return side * side * side;
    }

    public double cylinderVolume() {
        return Math.PI * radius * radius * height;
    }

    public double sphereVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class GeometryVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();

        System.out.println("Choose a Shape:");
        System.out.println("1. Cube");
        System.out.println("2. Cylinder");
        System.out.println("3. Sphere");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of the cube: ");
                obj.setSide(sc.nextDouble());
                System.out.println("Volume of Cube = " + obj.cubeVolume());
                break;

            case 2:
                System.out.print("Enter radius of the cylinder: ");
                obj.setRadius(sc.nextDouble());
                System.out.print("Enter height of the cylinder: ");
                obj.setHeight(sc.nextDouble());
                System.out.println("Volume of Cylinder = " + obj.cylinderVolume());
                break;

            case 3:
                System.out.print("Enter radius of the sphere: ");
                obj.setRadius(sc.nextDouble());
                System.out.println("Volume of Sphere = " + obj.sphereVolume());
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
