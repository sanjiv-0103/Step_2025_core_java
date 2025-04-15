import java.util.ArrayList;
import java.util.Scanner;
public class FindFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its factors: ");
		int num = scanner.nextInt();
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors.add(i); // Add the factor to the list
			}
		}
		System.out.println("Factors of " + num + ": " + factors);
		scanner.close();
	}
}