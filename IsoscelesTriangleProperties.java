import java.util.Scanner;

public class IsoscelesTriangleProperties {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the isosceles triangle
        System.out.print("Enter the length of the equal sides of the isosceles triangle: ");
        double equalSide = scanner.nextDouble();

        System.out.print("Enter the length of the base of the isosceles triangle: ");
        double base = scanner.nextDouble();

        // Calculate the area and perimeter of the isosceles triangle
        double height = Math.sqrt(equalSide * equalSide - (base * base) / 4);
        double area = 0.5 * base * height;
        double perimeter = 2 * equalSide + base;

        // Input the height for volume calculation
        System.out.print("Enter the height of the isosceles triangle (for volume): ");
        double triangleHeight = scanner.nextDouble();

        // Calculate the volume of the isosceles triangular prism
        double volume = area * triangleHeight;

        // Print the results
        System.out.println("Area of the isosceles triangle: " + area);
        System.out.println("Perimeter of the isosceles triangle: " + perimeter);
        System.out.println("Volume of the isosceles triangular prism: " + volume);

        // Close the scanner
        scanner.close();
    }
}


