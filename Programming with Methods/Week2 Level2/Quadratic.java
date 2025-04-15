import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		System.out.print("Enter coefficient a: ");
		double a = scanner.nextDouble();
		System.out.print("Enter coefficient b: ");
		double b = scanner.nextDouble();
		System.out.print("Enter coefficient c: ");
		double c = scanner.nextDouble();
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The roots are real and distinct.");
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.println("The root is real and repeated.");
			System.out.println("Root: " + root);
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("The roots are complex.");
			System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");

			System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
		}
		scanner.close();
	}
}