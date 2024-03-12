import java.util.Scanner;

public class DistanceCalculator {
	private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 // Input coordinates of the first point
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();

        // Input coordinates of the second point
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        // Calculate and print the distance between two points
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the two points: " + distance);

        // Close the scanner
        scanner.close();
		 

		       
		    }

	}

