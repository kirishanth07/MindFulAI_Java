import java.util.Scanner;

public class TriangleProperties {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the base and height of the triangle
        System.out.print("Enter the length of the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Input the lengths of the other two sides (assuming it's a right-angled triangle)
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = base + side2 + side3;

        // Calculate the area
        double area = 0.5 * base * height;

        // Print the results
        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);

        // Close the scanner
        scanner.close();
	}
}



