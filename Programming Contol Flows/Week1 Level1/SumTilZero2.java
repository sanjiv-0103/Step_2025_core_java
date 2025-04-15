import java.util.Scanner;
public class SumTilZero2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		double number;
		while (true) {
		System.out.print("Enter a number (0 or negative to stop): ");
		number = sc.nextDouble();

		if (number <= 0) {
		break;
		}
		total += number;
		}
		System.out.println("Total sum: " + total);
		sc.close();
	}
}