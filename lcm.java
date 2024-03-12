import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Find the maximum of two numbers
        int max = (number1 > number2) ? number1 : number2;

        // Initialize LCM
        int lcm = max;

        // Find LCM using a loop
        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                // LCM found
                break;
            }
            lcm += max;
        }

        // Print the LCM
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);

        // Close the scanner
        scanner.close();
		// TODO Auto-generated method stub

	}

}
