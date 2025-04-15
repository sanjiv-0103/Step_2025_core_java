import java.util.Arrays;
class NumberChecker {
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
	public static boolean isDuckNumber(int number) {
		int[] digits = storeDigits(number);
		for (int digit : digits) {
			if (digit != 0) {
				return true;
			}
		}
		return false;
	}	
	public static boolean isArmstrongNumber(int number) {
		int[] digits = storeDigits(number);
		int sum = 0;
		int numDigits = digits.length;
		for (int digit : digits) {
			sum += Math.pow(digit, numDigits);
		}
		return sum == number;
	}
	public static int[] findLargestAndSecondLargest(int[] digits) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for (int digit : digits) {
			if (digit > largest) {
				secondLargest = largest;
				largest = digit;
			} else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
		}
		return new int[] {largest, secondLargest};
	}
	public static int[] findSmallestAndSecondSmallest(int[] digits) {
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		for (int digit : digits) {
			if (digit < smallest) {
				secondSmallest = smallest;
				smallest = digit;
			} else if (digit < secondSmallest && digit != smallest) {
				secondSmallest = digit;
			}
		}
		return new int[] {smallest, secondSmallest};
	}
	public static void main(String[] args) {
		int number = 153;
		int[] digits = storeDigits(number);
		System.out.println("Number: " + number);
		System.out.println("Digits: " + Arrays.toString(digits));
		System.out.println("Count of digits: " + countDigits(number));
		System.out.println("Is Duck number: " + isDuckNumber(number));
		System.out.println("Is Armstrong number: " + isArmstrongNumber(number));
		int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
		System.out.println("Largest digit: " + largestAndSecondLargest[0]);
		System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
		int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
		System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
		System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
	}
}