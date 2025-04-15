import java.util.Scanner;
public class FizzBuzzNew {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");

		int num = scanner.nextInt();
		if (num <= 0) {
			System.out.println("Please enter a positive integer.");
			return;
		}
		String[] results = new String[num];
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				results[i - 1] = "FizzBuzz";
			} else if (i % 3 == 0) {
				results[i - 1] = "Fizz";
			} else if (i % 5 == 0) {
				results[i - 1] = "Buzz";
			} else {
				results[i - 1] = Integer.toString(i); // Store the number as string
			}
		}
		for (int i = 0; i < results.length; i++) {
			System.out.println("Position " + (i + 1) + " = " + results[i]);
		}
		scanner.close();
	}
}