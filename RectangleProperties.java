import java.util.Scanner;

public class RectangleProperties {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input the dimensions of the rectangle
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();

	        // Calculate the area and perimeter of the rectangle
	        double area = length * width;
	        double perimeter = 2 * (length + width);

	        // Input the height for volume calculation
	        System.out.print("Enter the height of the rectangle (for volume): ");
	        double height = scanner.nextDouble();

	        // Calculate the volume of the rectangle (assuming it's a rectangular prism)
	        double volume = length * width * height;

	        // Print the results
	        System.out.println("Area of the rectangle: " + area);
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	        System.out.println("Volume of the rectangular prism: " + volume);

	        // Close the scanner
	        scanner.close();
	    }
		// TODO Auto-generated method stub

	}


