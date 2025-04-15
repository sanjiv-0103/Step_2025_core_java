import java.util.Scanner;
public class Wind {
	public static double calculateWindChill(double temperature, double windSpeed) {
		return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) *
		Math.pow(windSpeed, 0.16));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter temperature (°F): ");
		double temp = scanner.nextDouble();
		System.out.print("Enter wind speed (mph): ");
		double windSpeed = scanner.nextDouble();
		System.out.println("Wind Chill Temperature: " + calculateWindChill(temp, windSpeed));
		scanner.close();
	]
}