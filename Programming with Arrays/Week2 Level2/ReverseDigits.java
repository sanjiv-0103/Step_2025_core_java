import java.util.Scanner;
class ReverseDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int count = 0;
		int temp = number;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int[] digits = new int[count];
		int[] reversedDigits = new int[count];
		for (int i = 0; i < count; i++) {
			digits[i] = number % 10;
			number /= 10;
		}
		for (int i = 0; i < count; i++) {
			reversedDigits[i] = digits[count - 1 - i];
		}
		System.out.print("Reversed number: ");
		for (int digit : reversedDigits) {
			System.out.print(digit);
		}
		System.out.println();
		input.close();
	}
}