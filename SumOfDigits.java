import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    // Input an integer
	    System.out.print("Enter an integer: ");
	    int inputNumber = scanner.nextInt();

	    // Calculate and print the sum of digits
	    int sum = 0;
	    int number = Math.abs(inputNumber);

	    while (number != 0) {
	        sum += number % 10;
	        number /= 10;
	    }

	    System.out.println("Sum of digits: " + sum);

	    // Close the scanner
	    scanner.close();
	
	    }

	}


