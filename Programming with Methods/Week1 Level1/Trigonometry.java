import java.util.Scanner;
public class Trigonometry {
	public static double[] trig(double angle) {
		double radians = Math.toRadians(angle);
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);
		return new double[]{sine, cosine, tangent};
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an angle in degrees: ");
		double angle = scanner.nextDouble();
		double[] results = trig(angle);
		System.out.println("Sine: " + results[0]);
		System.out.println("Cosine: " + results[1]);
		System.out.println("Tangent: " + results[2]);
		scanner.close();
	}
}