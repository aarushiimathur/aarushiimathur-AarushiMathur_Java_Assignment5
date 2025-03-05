import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect Shape:");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Pyramid\n7. Exit");
            int choice = scan.nextInt();
            if (choice == 7) break;
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    Circle c = new Circle(scan.nextDouble());
                    System.out.println("Area: " + c.calculateArea());
                    System.out.println("Perimeter: " + c.calculatePerimeter());
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    Rectangle r = new Rectangle(length, width);
                    System.out.println("Area: " + r.calculateArea());
                    System.out.println("Perimeter: " + r.calculatePerimeter());
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    Square s = new Square(scan.nextDouble());
                    System.out.println("Area: " + s.calculateArea());
                    System.out.println("Perimeter: " + s.calculatePerimeter());
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    Sphere sp = new Sphere(scan.nextDouble());
                    System.out.println("Surface Area: " + sp.calculateArea());
                    System.out.println("Volume: " + sp.calculateVolume());
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    double rad = scan.nextDouble();
                    System.out.print("Enter height: ");
                    Cylinder cy = new Cylinder(rad, scan.nextDouble());
                    System.out.println("Surface Area: " + cy.calculateArea());
                    System.out.println("Volume: " + cy.calculateVolume());
                    break;
                case 6:
                    System.out.print("Enter length: ");
                    double l = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double w = scan.nextDouble();
                    System.out.print("Enter height: ");
                    Pyramid p = new Pyramid(l, w, scan.nextDouble());
                    System.out.println("Surface Area: " + p.calculateArea());
                    System.out.println("Perimeter: " + p.calculatePerimeter());
                    System.out.println("Volume: " + p.calculateVolume());
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

