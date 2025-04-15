import java.util.Scanner;
class LargestSecondLargest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int[] digits = new int[10];
		int index = 0, maxDigit = 10;
		while (number > 0) {
			if (index == maxDigit) {
				maxDigit += 10;
				int[] temp = new int[maxDigit];
				System.arraycopy(digits, 0, temp, 0, digits.length);
				digits = temp;
			}
			digits[index++] = number % 10;
			number /= 10;
		}
		int largest = -1, secondLargest = -1;
		for (int i = 0; i < index; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}

		System.out.println("Largest Digit: " + largest);
		System.out.println("Second Largest Digit: " + secondLargest);
		input.close();
	}
}