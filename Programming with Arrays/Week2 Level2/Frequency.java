import java.util.Scanner;
class Frequency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int[] digits = new int[10];
		int temp = number;
		while (temp > 0) {
			digits[temp % 10]++;
			temp /= 10;
		}
		System.out.println("Frequency of each digit:");
		for (int i = 0; i < 10; i++) {
			if (digits[i] > 0) {
				System.out.println("Digit " + i + ": " + digits[i]);
			}
		}

		input.close();
	}
}