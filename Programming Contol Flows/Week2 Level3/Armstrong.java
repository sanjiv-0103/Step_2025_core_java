import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int originalNumber = number, sum = 0;
		while (originalNumber != 0) {
		int digit = originalNumber % 10;
		sum += digit * digit * digit;
		originalNumber /= 10;
		}
		if (sum == number) {
		System.out.println(number + " is an Armstrong Number.");
		} else {
		System.out.println(number + " is NOT an Armstrong Number.");
		}
		scanner.close();
	}
}