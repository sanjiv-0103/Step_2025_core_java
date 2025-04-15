import java.util.Arrays;
class UtilityNumberChecker {
	public static int countDigits(int number) {
		return String.valueOf(number).length();
	}
	public static int[] storeDigits(int number) {
		int count = countDigits(number);
		int[] digits = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}
	public static int sumDigits(int number) {
		int[] digits = storeDigits(number);
		int sum = 0;
		for (int digit : digits) {
			sum += digit;
		}
		return sum;
	}
	public static double sumSquaresOfDigits(int number) {
		int[] digits = storeDigits(number);
		double sum = 0;
		for (int digit : digits) {
			sum += Math.pow(digit, 2);
		}
		return sum;
	}
	public static boolean isHarshadNumber(int number) {
		int sum = sumDigits(number);
		return number % sum == 0;
	}
	public static int[][] digitFrequency(int number) {
		int[] digits = storeDigits(number);
		int[][] frequency = new int[10][2]; // 10 digits (0-9)
		for (int i = 0; i < digits.length; i++) {
			frequency[digits[i]][0] = digits[i];
			frequency[digits[i]][1]++;
		}
		return frequency;
	}
	public static void main(String[] args) {
		int number = 21;
		int[] digits = storeDigits(number);
		System.out.println("Number: " + number);
		System.out.println("Digits: " + Arrays.toString(digits));
		System.out.println("Count of digits: " + countDigits(number));
		System.out.println("Sum of digits: " + sumDigits(number));
		System.out.println("Sum of squares of digits: " + sumSquaresOfDigits(number));
		System.out.println("Is Harshad number: " + isHarshadNumber(number));
		int[][] frequency = digitFrequency(number);
		System.out.println("Digit Frequency:");
		for (int i = 0; i < 10; i++) {
			if (frequency[i][1] > 0) {
				System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
			}
		}
	}
}