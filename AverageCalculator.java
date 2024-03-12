import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input the value of N (number of elements)
        System.out.print("Enter the number of elements (N): ");
        int N = scanner.nextInt();

        // Input N numbers
        System.out.println("Enter " + N + " numbers:");
        double sum = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        // Calculate and print the average
        if (N > 0) {
            double average = sum / N;
            System.out.println("Average of the " + N + " numbers: " + average);
        } else {
            System.out.println("Cannot calculate average for N=0");
        }

        // Close the scanner
        scanner.close();
    }
}

