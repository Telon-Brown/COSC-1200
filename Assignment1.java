package Package1;
import java.util.Scanner;
public class Assignment1 {
// Have to import scanner to get the numbers and calculate it 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Telon Brown
		// COSC 1200 Assignment 1
		// Sunday February 4
		Scanner scanner = new Scanner(System.in);
		
		// User input for degrees
        System.out.print("Enter the angle of the projectile: ");
        double theta0 = scanner.nextDouble();

        // User input for velocity in m/s
        System.out.print("Enter the velocity of the projectile in m/s: ");
        double v0 = scanner.nextDouble();

        System.out.print("Enter the time instance in seconds to calculate the position: ");
        double t = scanner.nextDouble();

        scanner.close();

        // Convert angle from degrees to radians
        double theta0Radians = Math.toRadians(theta0);

        // This line calculates the horizontal distance (x)
        double x = v0 * Math.cos(theta0Radians) * t;

        // This line calculates the vertical distance (y)
        double y = (v0 * Math.sin(theta0Radians) * t) - (0.5 * 9.81 * Math.pow(t, 2));

        // Display the results
        System.out.println("\nProjectile Motion Results:");
        System.out.println("Horizontal distance: " + x + " meters");
        System.out.println("Vertical distance: " + y + " meters");
        
        //double stores decimal values
        //nextDouble() method scans the next token of the input as a double
		

	}

}
