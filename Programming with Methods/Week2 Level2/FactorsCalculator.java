import java.util.Scanner;
public class FactorsCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int[] factors = new int[num];
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors[count] = i;
				count++;
			}
		}
		System.out.print("Factors of " + num + " are: ");
		for (int i = 0; i < count; i++) {
			System.out.print(factors[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += factors[i];
		}
		scanner.close
	}
}