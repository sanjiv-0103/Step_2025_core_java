import java.util.Scanner;
public class NumberAnalysis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			int num = numbers[i];
			if (num > 0) {
				System.out.println(num + " is positive.");
				if (num % 2 == 0) {
					System.out.println(num + " is even.");
				} else {
					System.out.println(num + " is odd.");
			}
		} else if (num < 0) {
			System.out.println(num + " is negative.");
			} else {
				System.out.println(num + " is zero.");
			}
		}
		int first = numbers[0];
		int last = numbers[4];

		if (first == last) {
			System.out.println("The first and last elements are equal.");
		} else if (first > last) {
			System.out.println("The first element is greater than the last element.");
		} else {
			System.out.println("The first element is less than the last element.");
		}
		scanner.close();
	}
}